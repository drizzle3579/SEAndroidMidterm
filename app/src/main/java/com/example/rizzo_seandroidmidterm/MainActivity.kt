package com.example.rizzo_seandroidmidterm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val process = ProcessBuilder("curl", "https://cs-4263-252417.appspot.com").start()
            process.inputStream.reader(Charsets.UTF_8).use {
                println(it.readText())
            }
        }

    }
}