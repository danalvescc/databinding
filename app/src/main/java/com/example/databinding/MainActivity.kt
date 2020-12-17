package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Aleks Haecky")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        /*binding.helloworld.text = "Name"*/
        binding.myName = myName

        /*binding.apply {
            myName?.nickname = nicknameEdit.text.toString()
            invalidateAll()
        }
        o apply é para realizar alteração da variavel binding
        invalidateAll() é para alterar o valor da variável no UI
        */
    }
}