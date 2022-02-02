package com.mg.daggerplayground.injection

import com.mg.daggerplayground.car.DieselEngine
import com.mg.daggerplayground.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {
    @Binds
    abstract fun provideEngine(dieselEngine: DieselEngine): Engine
}