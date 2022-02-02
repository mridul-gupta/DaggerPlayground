package com.mg.daggerplayground

import android.util.Log

class Tires {

    private val TAG = "Tires"
    
    init {
        Log.d(TAG, "making tires: ")
    }

    fun inflate() {
        Log.d(TAG, "inflating tires: ")
    }
}