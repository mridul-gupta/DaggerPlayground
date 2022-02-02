package com.mg.daggerplayground.injection

import com.mg.daggerplayground.Rims
import com.mg.daggerplayground.Tires
import com.mg.daggerplayground.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims() = Rims()

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires) = Wheels(rims, tires)
}