package com.example.mycityapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CategoryViewModel : ViewModel() {
    private val _recommendations = MutableLiveData<List<Recommendation>>()
    val recommendations: LiveData<List<Recommendation>> get() = _recommendations

    fun loadRecommendations(category: String) {
        _recommendations.value = when (category) {
            "Tourist Spots" -> listOf(
                Recommendation("Mt. Kalugong Cultural Village", "A serene cultural village with rock formations, offering panoramic views and peaceful hiking trails.", R.drawable.kalugong),
                Recommendation("Valley of Colors", "A vibrant hillside adorned with colorful houses, creating a picturesque scene and ideal photo spot.", R.drawable.valleyofcolors),
                Recommendation("Strawberry Farm", "Famous for its fresh strawberries, this farm allows visitors to pick their own berries and enjoy local treats.", R.drawable.strawfarm),
                Recommendation("Mt. Yangbew", "A popular hiking destination known for its rolling hills, panoramic views, and sunrise viewing spots.", R.drawable.yangbew),
                Recommendation("Mt. Costa", "A beautifully landscaped garden featuring themed areas with lush greenery and a variety of plant life.", R.drawable.costa)

            )
            "Coffee Shops" -> listOf(
                Recommendation("Half Cup Cafe", "A charming spot with locally made pastries and signature coffee, perfect for a relaxed afternoon.", R.drawable.c1),
                Recommendation("Coffee and Pine Co.", "A cozy, homey cafe surrounded by pine decor, offering a warm and welcoming atmosphere.", R.drawable.c2),
                Recommendation("Fuzzy Cafe", "Famous for its delicious pastries and comfortable setting, ideal for coffee lovers.", R.drawable.c3),
                Recommendation("Pine Three Cafe", "A peaceful cafe with pine accents and handcrafted coffee, creating a natural and rustic vibe.", R.drawable.c4),
                Recommendation("Sinner or Saint Cafe", "A unique cafe with a variety of specialty drinks and a cozy, inviting ambiance.", R.drawable.c5)
            )
            "Foods" -> listOf(
                Recommendation("Dap-ayan", "A popular spot offering affordable local and international dishes with a lively atmosphere.", R.drawable.f1),
                Recommendation("Calajo Restaurant", "Known for its Filipino comfort food and desserts, especially their fresh strawberry delicacies.", R.drawable.f2),
                Recommendation("Health 101", "A health-conscious eatery with fresh, locally sourced ingredients and nutritious options.", R.drawable.f3),
                Recommendation("The Cabin", "A cozy dining spot featuring hearty meals and fresh, local ingredients with a rustic ambiance.", R.drawable.f4),
                Recommendation("Inglay Restaurant and Bakeshop", "A unique venue to enjoy craft beers and a variety of local delicacies and baked goods.", R.drawable.f5)
            )
            else -> emptyList()
        }
    }
}

