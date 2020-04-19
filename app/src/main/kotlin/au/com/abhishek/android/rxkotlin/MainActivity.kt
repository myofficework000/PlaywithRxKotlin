package au.com.abhishek.android.rxkotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import au.com.abhishek.android.rxkotlin.fragments.MainFragment
import au.com.abhishek.android.rxkotlin.fragments.RotationPersist1WorkerFragment
import au.com.abhishek.android.rxkotlin.fragments.RotationPersist2WorkerFragment
import au.com.abhishek.android.rxkotlin.rxbus.RxBus

/**
 * Created by Abhishek Pathak on 19/04/2020.
 */

class MainActivity : FragmentActivity() {

    private var _rxBus: RxBus? = null

    //     This is better done with a DI Library like Dagger
    val rxBusSingleton: RxBus
        get() {
            val res = _rxBus ?: RxBus()
            if (_rxBus == null) _rxBus = res
            return res;
        }

    override fun onBackPressed() {
        super.onBackPressed()
        _removeWorkerFragments()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(android.R.id.content, MainFragment(), this.toString())
                .commit()
        }
    }

    private fun _removeWorkerFragments() {
        var frag: Fragment? = supportFragmentManager
            .findFragmentByTag(RotationPersist1WorkerFragment::class.java.name)

        if (frag != null) {
            supportFragmentManager.beginTransaction().remove(frag).commit()
        }

        frag = supportFragmentManager
            .findFragmentByTag(RotationPersist2WorkerFragment::class.java.name)

        if (frag != null) {
            supportFragmentManager.beginTransaction().remove(frag).commit()
        }
    }
}
