package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    //esse :Com.. serve para transformar uma classe em activity. que são as funcionalidades (curtir,
    //comentar, salvar ...

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.button.setOnClickListener{
            binding.TextView.text = binding.EditTextView.text
        }

        binding.ImageView.setOnClickListener {
            Toast.makeText(this, "clicou na imagem", Toast.LENGTH_LONG).show()
        }
    }
}