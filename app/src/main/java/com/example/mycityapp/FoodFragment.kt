package com.example.mycityapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mycityapp.R

class FoodFragment : Fragment() {

    private val categoryViewModel: CategoryViewModel by viewModels()
    private lateinit var recommendationAdapter: RecommendationAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_food, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recommendationRecyclerView)
        recommendationAdapter = RecommendationAdapter()
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = recommendationAdapter

        categoryViewModel.loadRecommendations("Foods")

        categoryViewModel.recommendations.observe(viewLifecycleOwner) { recommendations ->
            recommendationAdapter.submitList(recommendations)
        }
    }
}
