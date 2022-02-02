package com.mg.daggerplayground.injection

import com.mg.daggerplayground.DieselEngine
import com.mg.daggerplayground.Engine
import com.mg.daggerplayground.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {
    @Provides
    fun provideEngine(dieselEngine: DieselEngine): Engine = dieselEngine
}