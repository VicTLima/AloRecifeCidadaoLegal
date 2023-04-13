package com.example.alrecife_cidadolegal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.alrecife_cidadolegal.databinding.ActivityTelaCadastroBinding

class tela_Cadastro : AppCompatActivity() {

    private lateinit var binding: ActivityTelaCadastroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cadastro2 = binding.btAccount
        val enome = binding.account
        //val cdoc = binding.dado
        //val cfone = binding.phone

        cadastro2.setOnClickListener {
            if (enome.text.toString() =="Vicente") {
                Toast.makeText(this, R.string.msgcad, Toast.LENGTH_SHORT).show()
                val inten3 = Intent(this, Tela_Greetings::class.java)
                inten3.putExtra("nome", enome.text.toString())
                startActivity(inten3)

            } else {
                Toast.makeText(this, R.string.msgcad2, Toast.LENGTH_SHORT).show()
            }


        }
    }

}