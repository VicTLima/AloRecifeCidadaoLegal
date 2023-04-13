package com.example.alrecife_cidadolegal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.alrecife_cidadolegal.databinding.ActivityTelaMenuBinding

class tela_Menu : AppCompatActivity() {
    private lateinit var binding: ActivityTelaMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val serv1 = binding.construction

        serv1.setOnClickListener {
        val inten3 = Intent(this,Tela_Service::class.java)
        startActivity(inten3)
        }
    }
}

