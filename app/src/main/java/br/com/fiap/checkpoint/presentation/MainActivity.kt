package br.com.fiap.checkpoint.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.bruno_henrique_rm87740.R
import br.com.fiap.bruno_henrique_rm87740.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}