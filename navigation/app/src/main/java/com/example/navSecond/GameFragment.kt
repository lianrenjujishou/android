package com.example.navSecond

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navSecond.databinding.FragmentAboutBinding
import com.example.navSecond.databinding.FragmentGameBinding

class GameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_game, container, false)
        val binding: FragmentGameBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_game,container, false)
        binding.gameButton.setOnClickListener{view ->
            view.findNavController().navigate(R.id.action_gameFragment_to_failFragment)
        }
        return binding.root
    }
}