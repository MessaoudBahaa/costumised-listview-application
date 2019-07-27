package com.bahaa.mobile


import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView= findViewById<ListView>(R.id.villes_list_view)

        val villesData:ArrayList<Ville> = ArrayList()
        villesData.add(Ville(1,"Alger","Capitale de l'algerie","drawable",125400))
        villesData.add(Ville(2,"Annaba","Capitale de l'algerie","drawable",125400))
        villesData.add(Ville(3,"Setif","Capitale de l'algerie","drawable",125400))
        villesData.add(Ville(4,"Oran","Capitale de l'algerie","drawable",125400))
        villesData.add(Ville(5,"Ouregula","Capitale de l'algerie","drawable",125400))
        villesData.add(Ville(1,"Alger","Capitale de l'algerie","drawable",125400))
        villesData.add(Ville(2,"Annaba","Capitale de l'algerie","drawable",125400))
        villesData.add(Ville(3,"Setif","Capitale de l'algerie","drawable",125400))
        villesData.add(Ville(4,"Oran","Capitale de l'algerie","drawable",125400))
        villesData.add(Ville(5,"Ouregula","Capitale de l'algerie","drawable",125400))
        val adapter = VillesListAdapter(this, villesData)
        listView.adapter = adapter


        val context = this
        listView.setOnItemClickListener { _, _, position, _ ->
            // 1
            val selectedVille = villesData[position]

            // 2
            val detailIntent = Intent(context, DetailVilleActivity::class.java)
            detailIntent.putExtra("nomVille",selectedVille.nom)
            detailIntent.putExtra("description",selectedVille.description)

            // 3
            startActivity(detailIntent)
        }

    }
}
