package com.example.alrecife_cidadolegal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.alrecife_cidadolegal.databinding.ActivityTelaCadastroBinding
import com.example.alrecife_cidadolegal.databinding.ActivityTelaGreetingsBinding

class Tela_Greetings : AppCompatActivity() {

    private lateinit var binding: ActivityTelaGreetingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaGreetingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val boavinda = binding.btvolta
        var gnome = intent.getStringExtra("nome")
        val pessoa = findViewById<TextView>(R.id.nome)

        pessoa.setText(gnome)






        boavinda.setOnClickListener{
            val inten4 = Intent(this, tela_Menu::class.java)
            startActivity(inten4)

        }

    }
}