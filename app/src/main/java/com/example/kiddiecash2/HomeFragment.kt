package com.example.kiddiecash2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
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


        view.findViewById<Button>(R.id.Login)?.setOnClickListener {
            val loginToJob = HomeFragmentDirections.actionHomeFragmentToDataFragment()
            findNavController().navigate(loginToJob)
        }

        view.findViewById<TextView>(R.id.RegisterButton)?.setOnClickListener {
            val loginToRegistration = HomeFragmentDirections.actionHomeFragmentToRegistrationFragment()
            findNavController().navigate(loginToRegistration)
        }

    }

}


