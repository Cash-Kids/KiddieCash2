package com.example.kiddiecash2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {

    private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        navController = Navigation.findNavController(view)


        view.findViewById<Button>(R.id.loginButton)?.setOnClickListener {
            val loginToJob = HomeFragmentDirections.actionHomeFragmentToJobFragment()
            findNavController().navigate(loginToJob)
        }

        view.findViewById<TextView>(R.id.regLink)?.setOnClickListener {
            val loginToRegistration = HomeFragmentDirections.actionHomeFragmentToRegistrationFragment()
            findNavController().navigate(loginToRegistration)
        }

    }

}


