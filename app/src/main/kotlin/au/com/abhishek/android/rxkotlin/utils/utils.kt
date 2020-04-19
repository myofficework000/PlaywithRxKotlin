package au.com.abhishek.android.rxkotlin.utils

import rx.Subscription

/**
 * Created by Abhishek Pathak on 19/04/2020.
 */

fun Subscription?.unSubscribeIfNotNull() {
    this?.unsubscribe()
}
