package au.com.abhishek.android.rxkotlin.fragments

import android.support.v4.app.Fragment
import au.com.abhishek.android.rxkotlin.MyApp

/**
 * Created by Abhishek Pathak on 19/04/2020.
 */
open class BaseFragment : Fragment() {

    override fun onDestroy() {
        super.onDestroy()
        MyApp.instance.refWatcher.watch(this)
    }
}
