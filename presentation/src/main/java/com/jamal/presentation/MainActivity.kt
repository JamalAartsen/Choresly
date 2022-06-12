package com.jamal.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import com.jamal.presentation.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModelClass: ViewModelClass by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        viewModelClass.createUser("voorbdweeeldwwd@gmail.com", "fefefefeff") { isSuccessful, exception ->
            Log.d("Callback", isSuccessful.toString())
            if (isSuccessful) {
                Log.d("Callback", "Boolean is true! + $exception")
            } else {
                Log.d("Callback", "Boolean is false! + $exception")
            }
            binding.progressBar.visibility = View.GONE
        }

        Log.d("User", "ID: ${viewModelClass.getCurrentUser()?.id} Name: ${viewModelClass.getCurrentUser()?.displayName} Email: ${viewModelClass.getCurrentUser()?.email}")

        if (viewModelClass.getCurrentUser().id != null) {
            Log.d("User", "User is not empty")
        } else {
            Log.d("User", "User is empty")
        }

    }
}