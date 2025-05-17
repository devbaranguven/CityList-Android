package com.example.landmarkbookkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarklist:ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarklist=ArrayList<Landmark>()

        val pisa=Landmark("Pisa","Italy",R.drawable.pisa)
        val eiffel=Landmark("Eiffel","France",R.drawable.eiffel)
        val londonBridge=Landmark("London Bridge","UK",R.drawable.londonbridge)
        val colesseum=Landmark("Colosseum","Italy",R.drawable.colosseum)

        landmarklist.add(pisa)
        landmarklist.add(eiffel)
        landmarklist.add(londonBridge)
        landmarklist.add(colesseum)

        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val landmarkadapter=LandmarkAdapter(landmarklist)
        binding.recyclerView.adapter=landmarkadapter

    }
}