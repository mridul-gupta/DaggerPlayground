package com.mg.daggerplayground.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    private val TAG = "Remote"

    fun setListener(car: Car) {
        Log.d(TAG, "remote connected:")
    }
}