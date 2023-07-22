package com.yusif.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yusif.landmarkbookkotlin.databinding.ActivityDetailsBinding

class  DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        //Casting - its (as Landmark)
        val selectLandmark = intent.getSerializableExtra("landmark") as Landmark

        val selectedLandmark = Singleton.chosenLandmark

        selectLandmark?.let {
            binding.nameText.text = it.name
            binding.countryText.text = it.country
            binding.imageView2.setImageResource(it.image)
        }

    }
}