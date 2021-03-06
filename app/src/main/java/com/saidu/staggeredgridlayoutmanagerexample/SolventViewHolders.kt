package com.saidu.staggeredgridlayoutmanagerexample

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class SolventViewHolders(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    var countryName: TextView
    var countryPhoto: ImageView

    init {
        itemView.setOnClickListener(this)
        countryName = itemView.findViewById<View>(R.id.country_name) as TextView
        countryPhoto = itemView.findViewById<View>(R.id.country_photo) as ImageView
    }

    override fun onClick(view: View) {
        Toast.makeText(view.context, "Clicked Position = " + position, Toast.LENGTH_SHORT).show()
    }
}
