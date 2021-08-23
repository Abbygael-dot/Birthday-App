package com.example.birthdayapp

import android.graphics.Color
import android.graphics.Color.blue
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image : ImageView = findViewById(R.id.imageView2)
        val button : Button = findViewById(R.id.button)
        val text  : TextView = findViewById(R.id.textView)
        val layout : View = findViewById(R.id.constraintlayout)

        button.setOnClickListener {
            image.visibility = View.VISIBLE
            button.setBackgroundColor(getColor(R.color.teal_200))
            layout.setBackgroundColor(getColor(R.color.newColor))
                    }
    }
}