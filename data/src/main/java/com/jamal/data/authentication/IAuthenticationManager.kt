package com.jamal.data.authentication

import java.lang.Exception

interface IAuthenticationManager {
    fun createUserWithEmailAndPassword(email: String, password: String, callback: (Boolean, Exception?) -> Unit)
    fun signInUserWithEmailAndPassword(email: String, password: String, callback: (Boolean, Exception?) -> Unit)
}