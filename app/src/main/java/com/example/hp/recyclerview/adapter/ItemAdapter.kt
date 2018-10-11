package com.example.hp.recyclerview.adapter

import android.content.ClipData
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hp.recyclerview.R
import com.example.hp.recyclerview.model.Persona
import kotlinx.android.synthetic.main.item_list.view.*
import android.content.Intent
import android.net.Uri
import android.support.v4.content.ContextCompat.startActivity
import android.widget.Toast
import android.support.v4.content.ContextCompat.startActivity




//paso 1
class ItemAdapter (val personasList:ArrayList<Persona>):RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    //paso 3
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false);
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        //paso 4
        return personasList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // paso 5
        holder.bindItems(personasList[position])
    }

    //paso 2
    class ViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindItems(item: Persona){
            itemView.txt_nombre.text = item.nombre
            itemView.txt_celular.text = item.celular
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "Cel:" + item.celular.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }

}


