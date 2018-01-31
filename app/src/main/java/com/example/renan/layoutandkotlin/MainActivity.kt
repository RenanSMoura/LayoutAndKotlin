package com.example.renan.layoutandkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {

    private val items = listOf("Teste","aehuae")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layoutList.layoutManager = LinearLayoutManager(this)
        layoutList.adapter = LayoutListAdapter(items){toast(it)}

    }
}
