package com.example.demokotlinkoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.demokotlinkoin.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var txt: TextView
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        txt = findViewById<TextView>(R.id.txt)
        setToDoData()
    }

    private fun setToDoData() {
        viewModel.getFirstToDo().observe(this, Observer {
            txt.text = it.title
        })
    }
}