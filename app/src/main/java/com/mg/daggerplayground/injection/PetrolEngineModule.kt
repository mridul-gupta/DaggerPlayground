package com.mg.daggerplayground.injection

import com.mg.daggerplayground.Engine
import com.mg.daggerplayground.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun provideEngine(petrolEngine: PetrolEngine): Engine
}