package com.example.kiddiecash2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class JobSpecPoopFragment : Fragment(R.layout.fragment_job_spec_poop) {

    val args: JobSpecPoopFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

//        val title = view?.findViewById<TextView>(R.id.selectedJob)

        return inflater.inflate(R.layout.fragment_job_spec_poop, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



//        val poopPatroller = args.poopJob
//        title.text.toString()
//
//
//        val shovelSoldier = args.shovelJob
//        title.setText(shovelSoldier)


        view.findViewById<Button>(R.id.submitBtn)?.setOnClickListener {
            val loginToConfirmation = JobSpecPoopFragmentDirections.actionJobSpecFragmentToConfirmationFragment()
            findNavController().navigate(loginToConfirmation)
        }


    }
}