package demo.android.sidemenu.fragment


import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import demo.android.sidemenu.R


/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class EeveeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val toastMessage = arguments.getCharSequence("toast")
        Toast.makeText(context, "$toastMessage", Toast.LENGTH_SHORT).show()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_eevee, container, false)
    }

}
