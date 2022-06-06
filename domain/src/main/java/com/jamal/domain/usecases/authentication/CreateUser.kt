package com.jamal.domain.usecases.authentication

import com.jamal.domain.repositories.AuthenticationDomainRepository
import java.lang.Exception
import javax.inject.Inject

class CreateUser @Inject constructor(
    private val authenticationDomainRepository: AuthenticationDomainRepository
) {
     operator fun invoke(email: String, password: String, callback: (Boolean, Exception?) -> Unit) {
        authenticationDomainRepository.createUser(email, password, callback)
    }
}