package com.android.example.csc300project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private val androidFacts = listOf(
        "Welcome to Android, CSC300 Class.",
        "Android is owned by Google Inc.",
        "Android powers over 2 billion devices worldwide, including Smartphones, Tablets, Watches, TVs, Cars, and many more.",
        "Android apps can be coded with Kotlin, Java, or C++, alongside XML.",
        "Android studio is the framework used to build android apps.",
    "Kotlin is inter-operable with Java.",
        "Gradle is the build tool/compiler in android studio.",
    "Android Layouts include constraint and Linear layouts.",
    "Android Views include TextViews, Buttons, ScrollViews, switches etc.",
    "A deep understanding of OOP is a pre-requisite for coding android apps.",
    "A junior android developer earns over 80,000 USD annually.")

    var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myText: TextView = findViewById(R.id.textView2)

            myText.text = androidFacts[currentIndex]

        val myButton:Button = findViewById(R.id.MyButton)

        myButton.setOnClickListener {
            currentIndex = (currentIndex + 1) % androidFacts.size
            myText.text = androidFacts[currentIndex]

        }

    }
}