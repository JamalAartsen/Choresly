package com.jamal.domain.usecases.authentication

import com.jamal.domain.models.UserDomain
import com.jamal.domain.repositories.AuthenticationDomainRepository
import javax.inject.Inject

class GetCurrentUser @Inject constructor(
    private val authenticationDomainRepository: AuthenticationDomainRepository
) {
    operator fun invoke(): UserDomain {
        return authenticationDomainRepository.getCurrentUser()
    }
}