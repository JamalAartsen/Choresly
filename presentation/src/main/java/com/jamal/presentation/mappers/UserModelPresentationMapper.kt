package com.jamal.presentation.mappers

import com.jamal.domain.models.UserDomain
import com.jamal.presentation.models.User
import javax.inject.Inject

class UserModelPresentationMapper @Inject constructor() {
    fun map(userDomain: UserDomain): User {
        return with(userDomain) {
            User(
                id = id,
                displayName = displayName,
                email = email
            )
        }
    }
}