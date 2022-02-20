package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    var list = ArrayList<String>(arrayListOf(
        "Hamburger","Pizza","Mexican","American","Chinese"
    ))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        val random:Random = Random();
        var food = list.get(random.nextInt(list.size))
        msg.text = "${food}!"
    }

    fun addFood(view: View) {
        var text = findViewById<EditText>(R.id.name)
        var addedFood = text.text.toString()
        list.add(addedFood)
        msg.text = "${addedFood}!"
    }
}