package com.jamal.presentation

import androidx.lifecycle.ViewModel
import com.jamal.domain.MyClass
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelClass @Inject constructor(
    private val myClass: MyClass
): ViewModel() {

    fun example(): String {
        return myClass.invoke()
    }
}