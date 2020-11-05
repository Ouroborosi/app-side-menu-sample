package demo.android.sidemenu

import android.app.Fragment
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import demo.android.sidemenu.fragment.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(navigationViewListener)
        /** set icon as default original color in code, but it affects all icons tint on nav **/
        nav_view.itemIconTintList = null
    }

    /**
     * if drawer menu is opened then close it on back pressed
     */
    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    /**
     * Inflate the menu; this adds items to the action bar if it is present.
     * e.g. menuInflater.inflate(R.menu.option_menu, menu)
     */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // No option menu
        return true
    }

    /**
     * Listening navigation view on click event
     */
    private val navigationViewListener = NavigationView.OnNavigationItemSelectedListener { item ->
        Log.d("selectMenuItem", "on ${item.itemId} / ${item.title}")

        var fragment = Fragment()
        when (item.itemId) {
            R.id.nav_pikachu_fragment -> {
                fragment = PikachuFragment()
            }

            R.id.nav_snorlax_fragment -> {
                fragment = SnorlaxFragment()
            }

            R.id.nav_jigglypuff_fragment -> {
                fragment = JigglypuffFragment()
            }

            R.id.nav_psyduck_fragment -> {
                fragment = PsyduckFragment()
            }

            R.id.nav_eevee_fragment -> {
                fragment = EeveeFragment()
            }

            R.id.nav_weedle_fragment -> {
                fragment = WeedleFragment()
            }

            R.id.nav_pokeball_fragment -> {
                fragment = PokeBallFragment()
            }

            R.id.nav_ultra_ball_fragment -> {
                fragment = UltraBallFragment()
            }

            R.id.nav_super_ball_fragment -> {
                fragment = SuperBallFragment()
            }
        }

        val bundle = Bundle()
        bundle.putCharSequence("toast", item.title)
        fragment.arguments = bundle

        fragmentManager.beginTransaction()
                .replace(R.id.content_main, fragment)
                .addToBackStack(null)
                .commit()

        item.isChecked = true
        drawer_layout.closeDrawer(GravityCompat.START)

        return@OnNavigationItemSelectedListener true
    }

}
