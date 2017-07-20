package com.saidu.staggeredgridlayoutmanagerexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.View
import android.widget.TextView
import java.util.ArrayList
import android.support.v7.widget.DefaultItemAnimator



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<View>(R.id.recycler_view) as RecyclerView
        recyclerView.setHasFixedSize(true)

        var gaggeredGridLayoutManager = StaggeredGridLayoutManager(2, 1)
        recyclerView.layoutManager = gaggeredGridLayoutManager



        val gaggeredList = getListItemData()

        val rcAdapter = SolventRecyclerViewAdapter(this@MainActivity, gaggeredList)
        recyclerView.adapter = rcAdapter
    }


    private fun getListItemData(): List<ItemObjects> {
        val listViewItems = ArrayList<ItemObjects>()
        listViewItems.add(ItemObjects("Alkane", R.drawable.image1))
        listViewItems.add(ItemObjects("Ethane", R.drawable.image3))
        listViewItems.add(ItemObjects("Alkyne", R.drawable.image4))
        listViewItems.add(ItemObjects("Benzene", R.drawable.four))
        listViewItems.add(ItemObjects("Amide", R.drawable.one))
        listViewItems.add(ItemObjects("saidul", R.drawable.matt2))
        listViewItems.add(ItemObjects("Amino Acid", R.drawable.image6))
        listViewItems.add(ItemObjects("Phenol", R.drawable.three))
        listViewItems.add(ItemObjects("Carbonxylic", R.drawable.four))
        listViewItems.add(ItemObjects("Nitril", R.drawable.one))
        listViewItems.add(ItemObjects("Ether", R.drawable.two))
        listViewItems.add(ItemObjects("Ester", R.drawable.image____))
        listViewItems.add(ItemObjects("Alcohol", R.drawable.four))

        return listViewItems
    }
}
