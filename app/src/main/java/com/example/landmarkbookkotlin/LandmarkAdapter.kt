package com.example.landmarkbookkotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.landmarkbookkotlin.databinding.RecyclerRowBinding

class LandmarkAdapter(val landmarklist:ArrayList<Landmark>):RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {
    class LandmarkHolder(val binding:RecyclerRowBinding): RecyclerView.ViewHolder(binding.root){

    }

    @SuppressLint(
        "SuspiciousIndentation"
    )
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LandmarkHolder {
     val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    override fun getItemCount(): Int {
    return landmarklist.size
    }

    @SuppressLint(
        "SuspiciousIndentation"
    )
    override fun onBindViewHolder(
        holder: LandmarkHolder,
        position: Int
    ) {
     holder.binding.recyclerViewTextView.text=landmarklist.get(position).name
        holder.itemView.setOnClickListener{
            val intent=Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarklist.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}