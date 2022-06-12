package com.jamal.presentation

import androidx.lifecycle.ViewModel
import com.jamal.domain.usecases.authentication.CreateUser
import com.jamal.domain.usecases.authentication.GetCurrentUser
import com.jamal.presentation.mappers.UserModelPresentationMapper
import com.jamal.presentation.models.User
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class ViewModelClass @Inject constructor(
    private val createUser: CreateUser,
    private val getCurrentUser: GetCurrentUser,
    private val userModelPresentationMapper: UserModelPresentationMapper
) : ViewModel() {

    fun createUser(email: String, password: String, callBack: (Boolean, Exception?) -> Unit) {
        createUser.invoke(email, password, callBack)
    }

    fun getCurrentUser(): User {
        return userModelPresentationMapper.map(getCurrentUser.invoke())
    }
}