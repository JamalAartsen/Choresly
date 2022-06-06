package com.jamal.presentation

import androidx.lifecycle.ViewModel
import com.jamal.domain.usecases.authentication.CreateUser
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class ViewModelClass @Inject constructor(
    private val createUser: CreateUser,
) : ViewModel() {

    fun createUser(email: String, password: String, callBack: (Boolean, Exception?) -> Unit) {
        createUser.invoke(email, password, callBack)
    }
}