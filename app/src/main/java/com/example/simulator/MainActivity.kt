package com.example.simulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.simulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // adicionado pelo binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* sem o binding seria assim
        // setContentView(R.layout.activity_main)
        // val tvHello = findViewById<TextView>(R.id.tvHello)
         */

        // com o binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // binding.tvHello.text = "Teste"


    }
}