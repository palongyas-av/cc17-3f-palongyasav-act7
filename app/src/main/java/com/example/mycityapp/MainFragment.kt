package com.example.mycityapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.categoryCoffeeShops).setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_coffeeShopsFragment)
        }
        view.findViewById<View>(R.id.categoryFood).setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_foodFragment)
        }
        view.findViewById<View>(R.id.categoryTouristSpots).setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_touristSpotFragment)
        }
    }
}
