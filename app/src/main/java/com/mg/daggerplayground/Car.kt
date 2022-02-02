package com.mg.daggerplayground

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, wheels: Wheels) {

    private val TAG = "Car"
    
    init {
        Log.d(TAG, "making car: ")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "driving.. ")
    }
}