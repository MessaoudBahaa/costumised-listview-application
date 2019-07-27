package com.bahaa.mobile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class VillesListAdapter (private val context: Context,
                         private val dataSource: ArrayList<Ville>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    //1
    override fun getCount(): Int {
        return dataSource.size
    }

    //2
    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    //3
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //4
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Get view for row item
        val rowView = inflater.inflate(R.layout.ville_list_layout, parent, false)

        val nomVilleTextView = rowView.findViewById(R.id.nomVille) as TextView

// Get subtitle element
        val nbTouristTextView = rowView.findViewById(R.id.nbTourist) as TextView

// Get thumbnail element
        val thumbnailImageView = rowView.findViewById(R.id.villeImage) as ImageView

        val ville = getItem(position) as Ville

        nomVilleTextView.text=ville.nom
        nbTouristTextView.text=ville.nombreTrourites.toString()

        thumbnailImageView.setImageResource(R.drawable.roma_list)

        return rowView
    }
}