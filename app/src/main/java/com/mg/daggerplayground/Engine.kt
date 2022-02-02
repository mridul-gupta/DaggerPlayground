package com.mg.daggerplayground

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {
    private val TAG = "Engine"

    init {
        Log.d(TAG, "making engine... ")
    }
}