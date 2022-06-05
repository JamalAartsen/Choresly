package com.jamal.data

import com.jamal.domain.DomainRepository
import javax.inject.Inject

class DataRepository @Inject constructor(): DomainRepository {
    override fun getMyClass(): String {
        return "Jamal Kayo Aartsen"
    }
}