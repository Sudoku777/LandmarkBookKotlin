package com.yusif.landmarkbookkotlin

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yusif.landmarkbookkotlin.databinding.ActivityMainBinding

val chosenLandmark:Landmark?=null

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        val colosseum = Landmark("Colosseum", "Italy", R.drawable.colosseum)
        val eiffel = Landmark("Eiffel", "France", R.drawable.eiffel)
        val londonBridge = Landmark("London Bridge", "England", R.drawable.london_bridge)

//        val bitmap = BitmapFactory.decodeResource(resources,R.drawable.pisa)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)


        //RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdaptor =LandmarkAdaptor(landmarkList)
        binding.recyclerView.adapter = landmarkAdaptor



/*

        // 3. Show image for users - Adaptor: layout & data
        //Mapping
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            landmarkList.map { landmark -> landmark.name })
        binding.listView.adapter = adapter //connect with arrayAdaptor

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(MainActivity@this,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarkList.get(i))
            startActivity(intent)
        }

*/

    }
}