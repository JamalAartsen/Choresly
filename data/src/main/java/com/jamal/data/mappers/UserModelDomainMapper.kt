package com.jamal.data.mappers

import com.jamal.data.authentication.models.User
import com.jamal.domain.models.UserDomain
import javax.inject.Inject

class UserModelDomainMapper @Inject constructor() {
    fun map(user: User): UserDomain {
        return with(user) {
            UserDomain(
                id = id,
                displayName = displayName,
                email = email
            )
        }
    }
}