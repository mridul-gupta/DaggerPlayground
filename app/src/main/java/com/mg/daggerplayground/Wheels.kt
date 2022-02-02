package com.mg.daggerplayground

import android.util.Log

class Wheels constructor(rims: Rims, tires: Tires) {

    private val TAG = "Wheels"

    init {
        Log.d(TAG, "making wheels ")
    }
}