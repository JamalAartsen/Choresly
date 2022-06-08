package com.jamal.data.modules

import com.jamal.data.authentication.AuthenticationRepository
import com.jamal.domain.repositories.AuthenticationDomainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun provideAuthenticationRepository(authenticationRepository: AuthenticationRepository): AuthenticationDomainRepository =
        authenticationRepository

}