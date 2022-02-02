package com.mg.daggerplayground.injection

import com.mg.daggerplayground.Engine
import com.mg.daggerplayground.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun provideEngine(petrolEngine: PetrolEngine): Engine = petrolEngine
}