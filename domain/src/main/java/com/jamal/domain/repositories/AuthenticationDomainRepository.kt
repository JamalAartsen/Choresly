package com.jamal.domain.repositories

import java.lang.Exception

interface AuthenticationDomainRepository {
    fun createUser(email: String, password: String, callback: (Boolean, Exception?) -> Unit)
}