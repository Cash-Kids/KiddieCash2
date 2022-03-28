package com.example.kiddiecash2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.navArgs
import kotlin.reflect.KProperty

class JobSpecFragment : Fragment() {

    private val args: JobSpecPoopFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_job_spec_poop, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val jobImage = args.jobImage1
//        val jobImageView = view.findViewById<ImageView>(R.id.displayJobImg)
//        jobImageView.setImageResource(jobImage)
    }

    operator fun getValue(dataFragment: JobFragment, property: KProperty<*>) {

    }
}