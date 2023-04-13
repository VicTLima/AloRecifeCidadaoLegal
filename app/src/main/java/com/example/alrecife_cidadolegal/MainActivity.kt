package com.example.alrecife_cidadolegal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.alrecife_cidadolegal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val eNome = binding.edUsuario
        val eSenha = binding.edSenha
        val blogin = binding.btLogin
        val tela2 = binding.newAccount

        blogin.setOnClickListener {
            if (eNome.text.toString() == "Vicente" && eSenha.text.toString () == "1234") {
                val inten = Intent(this, tela_Menu::class.java)
                val texto = eNome.text.toString()
                inten.putExtra("nome",texto)
                startActivity(inten)
            } else {
                Toast.makeText(this, R.string.msgError, Toast.LENGTH_SHORT).show()

            }
        }
        tela2.setOnClickListener {
            val inten2 = Intent(this, tela_Cadastro::class.java)
            startActivity(inten2)
        }

    }

}