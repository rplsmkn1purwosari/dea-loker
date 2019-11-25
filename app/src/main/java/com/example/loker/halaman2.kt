package com.example.loker

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [halaman2.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [halaman2.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class halaman2 : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_halaman2, container, false)

    }
    companion object {
        fun newInstance(): halaman2{
                val fragment = halaman2()
                val args = Bundle()
                fragment.arguments = args
                return fragment
        }
    }


}
