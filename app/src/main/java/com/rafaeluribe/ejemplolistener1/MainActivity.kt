package com.rafaeluribe.ejemplolistener1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.rafaeluribe.ejemplolistener1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var b:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)


        b.btn1.setOnClickListener(object: View.OnClickListener {
            override fun onClick(po: View?){
                b.txtTexto.text = "Hice click en el btn1"
            }
        })

        b.btn2.setOnClickListener { b.txtTexto.text = "Hice click en el btn2" }
    }
}