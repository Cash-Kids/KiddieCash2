package com.example.kiddiecash2

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import androidx.annotation.NonNull

public class H



class HomeFragment : Fragment() {

    var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.button).setOnClickListener(this)
    }
//        val view = inflater.inflate(R.layout.fragment_home, container, false)
//        val button = view.findViewById<Button>(R.id.button)
//        button.setOnClickListener {
//            findNavController().navigate(R.id.action_homeFragment_to_dataFragment)
//        }
//            return view

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_homeFragment)


        mtextEmailAddress = findViewById<EditText?>(R.id.Email)
        mtextPassword = findViewById<EditText?>(R.id.password)
        fAuth = FirebaseAuth.getInstance()
        mLogin = findViewById<Button?>(R.id.button)
        mCreateBtn = findViewById<TextView?>(R.id.createText)

    mLogin.setOnClickListener(
    object : View.OnClickListener {
        override fun onClick(v: View) {
            val email: String = mEmail.getText().toString().trim { it <= ' ' }
            val password: String = mPassword.getText().toString().trim { it <= ' ' }

            //for when someone clicks the login button without adding their email then it will say email required
            if (TextUtils.isEmpty(email)) {
                mEmail.setError("Email is Required.")
                return
            }
            //for when someone clicks the login button without adding their password then it will say email required
            if (TextUtils.isEmpty(password)) {
                mPassword.setError("Password is Required")
                return
            }
            //users must enter a password 6 characters or more
            if (password.length < 6) {
                mPassword.setError("Password Must be >= 6 characters")
                return
            }
            progressBar.setVisibility(View.VISIBLE)

            // now we are going to authenticate the user
            fAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(object : OnCompleteListener<AuthResult?>() {
                    fun onComplete(task: Task<AuthResult?>) {
                        if (task.isSuccessful()) {
                            Toast.makeText(
                                this@Login,
                                "Logged in Successfully.",
                                Toast.LENGTH_SHORT
                            ).show()
                            startActivity(Intent(getApplicationContext(), MainActivity::class.java))
                        } else {
                            Toast.makeText(
                                this@Login,
                                "Error !" + task.getException().getMessage(),
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                })
            mCreateBtn.setOnClickListener(View.OnClickListener {
                startActivity(
                    Intent(
                        getApplicationContext(),
                        Register::class.java
                    )
                )
            })
        }
    })
        }
    }

