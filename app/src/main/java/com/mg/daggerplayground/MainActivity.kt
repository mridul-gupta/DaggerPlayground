package com.mg.daggerplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mg.daggerplayground.car.Car
import com.mg.daggerplayground.injection.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerCarComponent.builder().build().inject(this)

        car.drive()
    }
}