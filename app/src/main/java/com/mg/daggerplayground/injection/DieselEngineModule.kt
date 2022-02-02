package com.mg.daggerplayground.injection

import com.mg.daggerplayground.DieselEngine
import com.mg.daggerplayground.Engine
import com.mg.daggerplayground.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class DieselEngineModule {
    @Binds
    abstract fun provideEngine(dieselEngine: DieselEngine): Engine
}