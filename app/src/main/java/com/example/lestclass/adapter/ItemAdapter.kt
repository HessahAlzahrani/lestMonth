package com.example.lestclass.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lestclass.R
import com.example.lestclass.model.book

class itemAdapter ( private val context: Context,
                    private val dataset: List<book>) :
    RecyclerView.Adapter<itemAdapter.ItemViewHolder>() {

    ///add class on class Adapter = (inheritance)
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }



    //////////////////////
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.newitem, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    ///////////////
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)

        ////// add hera  another holder for image view.....////
        holder.imageView.setImageResource(item.imageResourceId)


    }
/////////////////////////
    override fun getItemCount(): Int {
        return dataset.size
    }
}
