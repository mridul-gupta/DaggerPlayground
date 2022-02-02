package com.mg.daggerplayground

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(engine: Engine, wheels: Wheels) {

    private val TAG = "Car"

    fun drive() {
        Log.d(TAG, "driving.. ")
    }

}