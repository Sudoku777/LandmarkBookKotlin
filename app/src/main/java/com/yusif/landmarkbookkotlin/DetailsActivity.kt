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
        val selectedLandmark = intent.getSerializableExtra("Landmark") as Landmark

        binding.nameText.text=selectedLandmark.name
        binding.countryText.text=selectedLandmark.country
        binding.imageView2.setImageResource(selectedLandmark.image)


    }
}