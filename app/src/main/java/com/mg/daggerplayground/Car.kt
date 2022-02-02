package com.mg.daggerplayground

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(engine: Engine, wheels: Wheels) {

    private val TAG = "Car"
    
    init {
        Log.d(TAG, "making car: ")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        Log.d(TAG, "driving.. ")
    }
}