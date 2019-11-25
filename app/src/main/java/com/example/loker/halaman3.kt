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
 * [halaman3.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [halaman3.newInstance] factory method to
 * create an instance of this fragment.
 *
 */


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */

    class halaman3 : Fragment() {
        // TODO: Rename and change types of parameters
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                  savedInstanceState: Bundle?): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_halaman3, container, false)

        }
        companion object {
            fun newInstance(): halaman3{
                val fragment = halaman3()
                val args = Bundle()
                fragment.arguments = args
                return fragment
            }
        }


    }
