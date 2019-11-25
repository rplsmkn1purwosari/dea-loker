package com.example.loker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.constraintlayout.widget.Placeholder
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.fragment_halaman1.view.*

class Dashboard : AppCompatActivity() {

    private var content: FrameLayout? = null
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
        item -> when (item.itemId) {
        R.id.navigation_satu -> {
            val fragment = halaman1.newInstance()
            addFragment(fragment)
            return@OnNavigationItemSelectedListener true
        }
        R.id.navigation_dua -> {
            val fragment = halaman2()
            addFragment(fragment)
            return@OnNavigationItemSelectedListener true
        }
        R.id.navigation_tiga -> {
            val fragment = halaman3()
            addFragment(fragment)
            return@OnNavigationItemSelectedListener true
        }
        
      }
        false
    }



    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
//            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
            .commit()

    }
//    private var mSectionPagerAdapter: SectionsPagerAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        val fragment = halaman1.newInstance()
        addFragment(fragment)

//        setSupportActionBar(toolbar)
//        toolbar.title = "Slider"
//        toolbar.subtitle = "Slide left"

//        mSectionPagerAdapter = mSectionPagerAdapter

    }

//    slider

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.)
//        return true
//    }
//    inner class  SectionsPagerAdapter(fm: FragmentManager) :FragmentPagerAdapter(fm){
//        override fun getItem(position: Int): Fragment {
//            return PlaceholderFragment.newInstance(position +1)
//
//        }
//
//        override fun getCount(): Int {
//            return 5
//        }
//    }

//    class PlaceholderFragment : Fragment(){
//        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//            val rootView = inflater.inflate(R.layout.fragment_halaman1,container,false)
//            if (arguments!!.getInt(ARG_SECTION_NUMBER)== 1){
//                rootView.title_slider.text = "Title One"
//                rootView.image_iv.setImageResource(R.drawable.slider_satu)
//                rootView.decription.text = "Aloooo"
//            }
//            if (arguments!!.getInt(ARG_SECTION_NUMBER)== 2){
//                rootView.title_slider.text = "Title Two"
//                rootView.image_iv.setImageResource(R.drawable.slider_satu)
//                rootView.decription.text = "Aloooo"
//            }
//            if (arguments!!.getInt(ARG_SECTION_NUMBER)== 3){
//                rootView.title_slider.text = "Title One"
//                rootView.image_iv.setImageResource(R.drawable.slider_satu)
//                rootView.decription.text = "Aloooo"
//            }
//            if (arguments!!.getInt(ARG_SECTION_NUMBER)== 4){
//                rootView.title_slider.text = "Title One"
//                rootView.image_iv.setImageResource(R.drawable.slider_satu)
//                rootView.decription.text = "Aloooo"
//            }
//            if (arguments!!.getInt(ARG_SECTION_NUMBER)== 5){
//                rootView.title_slider.text = "Title One"
//                rootView.image_iv.setImageResource(R.drawable.slider_satu)
//                rootView.decription.text = "Aloooo"
//            }
//            return rootView
//
//        }
//        companion object{
//            private val ARG_SECTION_NUMBER = "section_number"
//
//            fun newInstance (sectionNumber: Int):PlaceholderFragment {
//                val fragment = PlaceholderFragment()
//                val args = Bundle()
//                args.putInt(ARG_SECTION_NUMBER , sectionNumber)
//                fragment.arguments = args
//                return fragment
//            }
//        }
//    }

}


