package com.example.peredachadannyh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.peredachadannyh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val text = MainText
        Log.d("TwT", text.toString())
        val intent = Intent(this@MainActivity, SecondAct::class.java)
        binding.buttonToSecond.setOnClickListener {
            text.title = "данные получены с главного активити"
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        val text = MainText
        Log.d("TwT", text.toString())
        binding.textOnMain.text = text.title
    }
}