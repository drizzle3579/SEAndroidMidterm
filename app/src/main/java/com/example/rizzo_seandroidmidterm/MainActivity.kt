package com.example.rizzo_seandroidmidterm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result = ""

        fun query() {
            result = URL("https://cs-4263-252417.appspot.com").readText()
        }

        button.setOnClickListener {
            GlobalScope.launch {
                query()
            }
            if (result != "") number.text = result
        }
    }
}