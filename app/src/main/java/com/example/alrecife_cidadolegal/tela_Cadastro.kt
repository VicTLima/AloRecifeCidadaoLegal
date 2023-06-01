package com.example.alrecife_cidadolegal


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.alrecife_cidadolegal.databinding.ActivityTelaCadastroBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase



class tela_Cadastro : AppCompatActivity() {

    private lateinit var binding: ActivityTelaCadastroBinding
    private lateinit var dbRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cadastro2 = binding.btAccount
        val enome = binding.account
        val cdoc = binding.dado
        val cfone = binding.phone
        val csenha = binding.password2
        val relatorio = binding.btRelatorio

        dbRef = FirebaseDatabase.getInstance().getReference("usuario")

        cadastro2.setOnClickListener {
            val usuNome = enome.text.toString()
            val usuDoc = cdoc.text.toString()
            val usuFone = cfone.text.toString()
            val usuSenha = csenha.text.toString()

            if (usuNome.isEmpty()) {
               enome.error = "Por favor insira um nome"
            }
            if (usuDoc.isEmpty()) {
              cdoc.error = "Por favor insira um Documento"
            }
            if (usuFone.isEmpty()) {
               cfone.error = "Por favor insira um Celular"
            }
            if (usuSenha.isEmpty()) {
               csenha.error = "Por favor insira uma Senha"
            }

            val usuId = dbRef.push().key!!

            val usuario = Cadlog(usuId, usuNome, usuDoc, usuFone, usuSenha)

            dbRef.child(usuId).setValue(usuario)
                .addOnCompleteListener {
                   Toast.makeText(this, "Cadastro realizado", Toast.LENGTH_SHORT).show()
                    enome.text.clear()
                    cdoc.text.clear()
                    cfone.text.clear()
                    csenha.text.clear()
                }.addOnFailureListener { err ->
                    Toast.makeText(this, "Error ${err.message}", Toast.LENGTH_SHORT).show()
                }
        }
        //val relatorio = binding.btRelatorio

        relatorio.setOnClickListener {
            val inten4 = Intent(this,Lista1::class.java)
           startActivity(inten4)
        }
    }
}

    