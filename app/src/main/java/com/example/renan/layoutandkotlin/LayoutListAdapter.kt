package com.example.renan.layoutandkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import org.jetbrains.anko.toast
import kotlinx.android.synthetic.main.item_layout_list.view.*

class LayoutListAdapter(val list: List<String>, val itemClick :(String) -> Unit): RecyclerView.Adapter<LayoutListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_list,parent,false)
        return ViewHolder(view,itemClick)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int  = list.size


    class ViewHolder(view: View,val itemClick: (String) -> Unit) : RecyclerView.ViewHolder(view){
      fun bind(string: String){
          itemView.itemLayout.text = string
          itemView.setOnClickListener{ itemClick(string)}
      }

    }

}