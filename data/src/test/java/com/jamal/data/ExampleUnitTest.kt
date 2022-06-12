package com.jamal.data

import com.jamal.data.authentication.firebase.FirebaseAuthenticationManager
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun createUser(firebaseAuthenticationManager: FirebaseAuthenticationManager) {
        firebaseAuthenticationManager.createUserWithEmailAndPassword(
            "jamal@gmail.com",
            "dedw"
        ) { isSuccessful, exception ->
            assertEquals(true, isSuccessful)
            assertEquals(null, exception)
        }
        assertEquals(true, true)
    }
}