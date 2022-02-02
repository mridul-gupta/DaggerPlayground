package com.mg.daggerplayground.car

import android.util.Log

class Wheels constructor(rims: Rims, tires: Tires) {

    private val TAG = "Wheels"

    init {
        Log.d(TAG, "making wheels ")
    }
}