package com.example.navSecond

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navSecond.databinding.FragmentAboutBinding
import com.example.navSecond.databinding.FragmentFailBinding

class FailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fail, container, false)
        val binding: FragmentFailBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_fail,container, false)
        binding.failButton.setOnClickListener{view ->
            view.findNavController().navigate(R.id.action_failFragment_to_wonFragment)
        }
        return binding.root
    }
}