package com.example.navSecond

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navSecond.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_about, container, false)
        val binding: FragmentAboutBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_about,container, false)
        binding.aboutButton.setOnClickListener{view ->
            view.findNavController().navigate(R.id.action_aboutFragment_to_gameFragment)
        }
        return binding.root
    }
}