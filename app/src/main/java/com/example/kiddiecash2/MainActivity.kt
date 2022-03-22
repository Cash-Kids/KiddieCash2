package com.example.kiddiecash2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragment) as NavHostFragment
            navController = navHostFragment.navController

//        // "default_activity_button" may be named incorrectly
//
//        val loginButton = findViewById<Button>(R.id.button)
//        loginButton.setOnClickListener {
//            val Intent = Intent(this,SecondActivity::class.java)
//            startActivity(Intent)
//        }
    }
}