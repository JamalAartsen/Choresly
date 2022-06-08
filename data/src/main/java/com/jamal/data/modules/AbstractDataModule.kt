package com.jamal.data.modules

import com.jamal.data.authentication.firebase.FirebaseAuthenticationManager
import com.jamal.data.authentication.IAuthenticationManager
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AbstractDataModule {

    @Binds
    abstract fun provideAuthenticationInterface(firebaseAuthenticationManager: FirebaseAuthenticationManager): IAuthenticationManager
}