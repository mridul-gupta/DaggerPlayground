package com.mg.daggerplayground.injection

import com.mg.daggerplayground.Car
import com.mg.daggerplayground.MainActivity
import dagger.Component

@Component(
    modules = [WheelsModule::class, DieselEngineModule::class]
)
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}