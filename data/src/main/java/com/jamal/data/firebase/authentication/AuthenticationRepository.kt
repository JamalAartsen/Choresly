package com.jamal.data.firebase.authentication

import com.jamal.domain.repositories.AuthenticationDomainRepository
import java.lang.Exception
import javax.inject.Inject

class AuthenticationRepository @Inject constructor(
    private val authenticationManager: AuthenticationManager
) : AuthenticationDomainRepository {
    override fun createUser(email: String, password: String, callback: (Boolean, Exception?) -> Unit) {
        authenticationManager.createUserWithEmailAndPassword(email, password, callback)
    }
}