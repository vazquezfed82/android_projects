package com.example.testingrecyclerview.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testingrecyclerview.Model.Person
import com.example.testingrecyclerview.R

class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

private val titleText: TextView = itemView.findViewById(R.id.item_title)

    fun bind(person : Person){
        titleText.text = person.name
    }
}