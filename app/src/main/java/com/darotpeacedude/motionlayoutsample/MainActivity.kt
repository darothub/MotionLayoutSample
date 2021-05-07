package com.darotpeacedude.motionlayoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val names = arrayOf("Bola Tola", "Kemi Temi", "Idris Lola", "Femi Koni")
        val adpt = RecyclerAdapter(names)
        val rec = findViewById<RecyclerView>(R.id.rec)
        rec.adapter = adpt

    }
}