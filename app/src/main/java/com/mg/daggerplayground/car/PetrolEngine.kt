package com.mg.daggerplayground.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(): Engine {
    private val TAG = "PetrolEngine"
    override fun start() {
        Log.d(TAG, "start: petrol engine")
    }
}