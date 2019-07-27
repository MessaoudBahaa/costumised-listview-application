package com.bahaa.mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class DetailVilleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_ville_layout)


        val imageVille:ImageView=findViewById(R.id.imageVille)
        imageVille.setImageResource(R.drawable.roma_list)

        val nomVille:TextView=findViewById(R.id.nomVille)
        nomVille.text=intent.getStringExtra("nomVille")
        val descriptionTextView:TextView=findViewById(R.id.descriptionVille)
        descriptionTextView.text=intent.getStringExtra("description")
    }
}
