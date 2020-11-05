package demo.android.sidemenu.fragment


import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import demo.android.sidemenu.R


/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class SnorlaxFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_snorlax, container, false)
    }

}
