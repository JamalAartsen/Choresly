package com.jamal.domain

import javax.inject.Inject

class MyClass @Inject constructor(
    private val repositoryHallo: DomainRepository
) {
    operator fun invoke() : String {
        return repositoryHallo.getMyClass()
    }
}