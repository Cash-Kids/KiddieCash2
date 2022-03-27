package com.example.kiddiecash2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragment_container_view_tag) as NavHostFragment
        navController = navHostFragment.navController

//        val dataFragment = DataFragment()
//        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,dataFragment).commit()


    }

    fun logout(view: View) {
        FirebaseAuth.getInstance().signOut() //logout
        // need to make an Intent for after you hit the logout button that it will go to the Login screen (HomeFragment)
    }
}

//    override fun passDataCom(editTextInput: String) {
//        val bundle = Bundle()
//        bundle.putString("message", editTextInput)
//
//        val transaction = this.supportFragmentManager.beginTransaction()
//        val jobSpecFragment = JobSpecFragment()
//        jobSpecFragment.arguments = bundle
//
//        transaction.replace(R.id.fragment_container, jobSpecFragment)
//        transaction.commit()


