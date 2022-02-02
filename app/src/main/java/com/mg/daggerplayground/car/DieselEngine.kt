package com.mg.daggerplayground.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(): Engine {
    private val TAG = "DieselEngine"
    override fun start() {
        Log.d(TAG, "start: diesel engine")
    }
}