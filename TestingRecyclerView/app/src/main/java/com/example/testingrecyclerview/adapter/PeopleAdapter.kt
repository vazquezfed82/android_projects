package com.example.testingrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testingrecyclerview.Model.Person
import com.example.testingrecyclerview.R

//no lleva data class porque tiene logica
class PeopleAdapter(private val peopleList: List<Person>): RecyclerView.Adapter<PersonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.simple_item,parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(peopleList[position])
    }

    override fun getItemCount(): Int {
        return peopleList.size
    }
}

