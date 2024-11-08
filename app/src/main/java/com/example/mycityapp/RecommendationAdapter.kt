package com.example.mycityapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class RecommendationAdapter : ListAdapter<Recommendation, RecommendationAdapter.RecommendationViewHolder>(RecommendationDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recommendation, parent, false)
        return RecommendationViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecommendationViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class RecommendationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.recommendationName)
        private val imageView: ImageView = itemView.findViewById(R.id.recommendationImage)
        private val descriptionTextView: TextView = itemView.findViewById(R.id.recommendationDescription)

        fun bind(recommendation: Recommendation) {
            titleTextView.text = recommendation.name
            imageView.setImageResource(recommendation.imageResId)
            descriptionTextView.text = recommendation.description
        }
    }

    class RecommendationDiffCallback : DiffUtil.ItemCallback<Recommendation>() {
        override fun areItemsTheSame(oldItem: Recommendation, newItem: Recommendation): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Recommendation, newItem: Recommendation): Boolean {
            return oldItem == newItem
        }
    }
}