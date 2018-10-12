package com.example.hp.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.example.hp.recyclerview.adapter.ItemAdapter
import com.example.hp.recyclerview.model.Persona
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v4.view.accessibility.AccessibilityEventCompat.setAction
import android.view.View


class MainActivity : AppCompatActivity() {

    var lista_contactos = ArrayList<Persona>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = obtenerLista()
        recyclerview_item.layoutManager=LinearLayoutManager(this)
        recyclerview_item.adapter = ItemAdapter(items)
        //recyclerview_item.layoutManager=GridLayoutManager(this,2)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Se inserto nuevo contacto", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show()
            insertarContacto()
            recyclerview_item.adapter = ItemAdapter(items)
        }



    }
        fun insertarContacto():ArrayList<Persona>{
            lista_contactos.add(Persona(5,"Alejandro Alcon","72394872"))
            return lista_contactos
        }

        fun obtenerLista():ArrayList<Persona>{
            lista_contactos.add(Persona(1,"Adalid Limachi","69843755"))
            lista_contactos.add(Persona(2,"Cristian Rojas","74087546"))
            lista_contactos.add(Persona(3,"Jose Loza","70165360"))

            return lista_contactos
        }

}
