package au.com.abhishek.android.rxkotlin.utils

import android.support.v4.content.ContextCompat
import android.view.View
import org.jetbrains.anko.AnkoException

/**
 * Created by Abhishek Pathak on 19/04/2020.
 */

inline fun View.colorInt(colorInt: View.() -> Int): Int {
    return ContextCompat.getColor(context, colorInt())
}

var android.view.View.backgroundColorByResId: Int
    get() = throw AnkoException("'android.view.View.backgroundColor' property does not have a getter")
    set(v) = setBackgroundColor(ContextCompat.getColor(context, v))