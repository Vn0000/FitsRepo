package com.example.peredachadannyh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.peredachadannyh.databinding.ActivitySecondBinding

class SecondAct : AppCompatActivity() {
    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val text = MainText
        Log.d("TwT", text.toString())
        binding.textOnSecond.text = text.title
        binding.buttonToMine.setOnClickListener {
            text.title = "данные получены из 2 активити"
            finish()
        }
    }
}