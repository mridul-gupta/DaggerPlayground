package com.mg.daggerplayground

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor() {

    private val TAG = "Wheels"

    init {
        Log.d(TAG, "making wheels ")
    }
}