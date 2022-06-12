package com.jamal.data.authentication

import com.jamal.data.mappers.UserModelDomainMapper
import com.jamal.domain.models.UserDomain
import com.jamal.domain.repositories.AuthenticationDomainRepository
import java.lang.Exception
import javax.inject.Inject

class AuthenticationRepository @Inject constructor(
    private val iAuthenticationManager: IAuthenticationManager,
    private val userModelDomainMapper: UserModelDomainMapper

) : AuthenticationDomainRepository {
    override fun createUser(email: String, password: String, callback: (Boolean, Exception?) -> Unit) {
        iAuthenticationManager.createUserWithEmailAndPassword(email, password, callback)
    }

    override fun getCurrentUser(): UserDomain {
        return userModelDomainMapper.map(iAuthenticationManager.getCurrentUser())
    }
}