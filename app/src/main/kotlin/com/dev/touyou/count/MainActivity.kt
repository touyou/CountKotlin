package com.dev.touyou.count

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {

    var text: TextView? = null
    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.textView) as TextView
        text?.setText("0")
    }

    fun plus(v: View) {
        number += 1
        text?.setText(number.toString())
    }
    fun minus(v: View) {
        number -= 1
        text?.setText(number.toString())
    }
    fun clear(v: View) {
        number = 0
        text?.setText(number.toString())
    }
}
