package me.tanyakemkar.firstdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = findViewById<TextView>(R.id.textView)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            text.text = "Namaste World!"
        }
    }
}