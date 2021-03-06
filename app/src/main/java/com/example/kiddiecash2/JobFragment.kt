package com.example.kiddiecash2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class JobFragment : Fragment() {

   // private val args: JobSpecFragment by JobSpecFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_job, container, false)




           return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        navController = Navigation.findNavController(view)


        view?.findViewById<ImageView>(R.id.imageView)?.setOnClickListener {
            val dataToJob = JobFragmentDirections.actionJobFragmentToJobSpecLawn()
            findNavController().navigate(dataToJob)

            val imageView : ImageView = view.findViewById(R.id.imageView)
//            val input = imageView.text.toString()

            // Using bundles to transfer data between fragments
            val bundle = Bundle()
//            bundle.putString("data", input)
            // want to transfer to JobSpecFragment
            var dataFragment = JobSpecFragment()
//            fragment.arguments = bundle
//            fragmentManager?.beginTransaction()?.replace(R.id.nav_container,fragment)?.commit()


        }
        view?.findViewById<ImageView>(R.id.imageView2)?.setOnClickListener {
            val dataToJob = JobFragmentDirections.actionDataFragmentToJobSpecFragment()
            findNavController().navigate(dataToJob)
        }
        view?.findViewById<ImageView>(R.id.imageView3)?.setOnClickListener {
            val dataToJob = JobFragmentDirections.actionJobFragmentToJobSpecShovelFragment()
            findNavController().navigate(dataToJob)
        }


    }

}