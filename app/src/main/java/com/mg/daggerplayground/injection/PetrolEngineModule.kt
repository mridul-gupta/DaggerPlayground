package com.mg.daggerplayground.injection

import com.mg.daggerplayground.car.Engine
import com.mg.daggerplayground.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun provideEngine(petrolEngine: PetrolEngine): Engine
}