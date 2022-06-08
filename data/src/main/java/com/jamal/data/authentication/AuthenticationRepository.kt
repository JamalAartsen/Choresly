package com.jamal.data.authentication

import com.jamal.domain.repositories.AuthenticationDomainRepository
import java.lang.Exception
import javax.inject.Inject

class AuthenticationRepository @Inject constructor(
    private val iAuthenticationManager: IAuthenticationManager

) : AuthenticationDomainRepository {
    override fun createUser(email: String, password: String, callback: (Boolean, Exception?) -> Unit) {
        iAuthenticationManager.createUserWithEmailAndPassword(email, password, callback)
    }
}