package com.jamal.data.authentication.firebase

import com.google.firebase.auth.FirebaseAuth
import com.jamal.data.authentication.IAuthenticationManager
import com.jamal.data.authentication.models.User
import java.lang.Exception
import javax.inject.Inject

class FirebaseAuthenticationManager @Inject constructor() : IAuthenticationManager {

    private val firebaseAuth: FirebaseAuth by lazy {
        FirebaseAuth.getInstance()
    }

    override fun createUserWithEmailAndPassword(
        email: String,
        password: String,
        callback: (Boolean, Exception?) -> Unit
    ) {
        firebaseAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    callback(true, task.exception)
                } else {
                    callback(false, task.exception)
                }
            }
    }

    override fun signInUserWithEmailAndPassword(
        email: String,
        password: String,
        callback: (Boolean, Exception?) -> Unit
    ) {
        firebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    callback(true, task.exception)
                } else {
                    callback(false, task.exception)
                }
            }
    }

    override fun getCurrentUser(): User {
        val currentUser = firebaseAuth.currentUser
        return User(
            currentUser?.uid,
            currentUser?.displayName,
            currentUser?.email
        )
    }
}