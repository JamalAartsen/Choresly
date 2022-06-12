package com.jamal.domain.repositories

import com.jamal.domain.models.UserDomain
import java.lang.Exception

interface AuthenticationDomainRepository {
    fun createUser(email: String, password: String, callback: (Boolean, Exception?) -> Unit)
    fun getCurrentUser(): UserDomain
}