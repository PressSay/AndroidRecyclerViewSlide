package com.colagom.infiniterv

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarouselAdapterCustomer(
    private val context: Context,
    private val items: List<OfficialDish>
) : RecyclerView.Adapter<CarouselAdapterCustomer.ItemViewHolder>() {

    val actualItemCount
        get() = items.size

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val img1: ImageView = view.findViewById(R.id.imageViewOfficialDish1)
        val img2: ImageView = view.findViewById(R.id.imageViewOfficialDish2)
        val img3: ImageView = view.findViewById(R.id.imageViewOfficialDish3)
        val cost1: TextView = view.findViewById(R.id.textViewCostOfficialDish1)
        val cost2: TextView = view.findViewById(R.id.textViewCostOfficialDish2)
        val cost3: TextView = view.findViewById(R.id.textViewCostOfficialDish3)
        val title1: TextView = view.findViewById(R.id.textViewTitleOfficialDish1)
        val title2: TextView = view.findViewById(R.id.textViewTitleOfficialDish2)
        val title3: TextView = view.findViewById(R.id.textViewTitleOfficialDish3)
        val category: TextView = view.findViewById(R.id.categoryOfficialDish)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterView = LayoutInflater.from(parent.context).inflate(R.layout.item_official_dish, parent, false)
        return ItemViewHolder(adapterView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.img1.setImageResource(item.img1)
        holder.img2.setImageResource(item.img2)
        holder.img3.setImageResource(item.img3)
        holder.cost1.text = context.getString(item.cost1, position)
        holder.cost2.text = context.getString(item.cost2, position)
        holder.cost3.text = context.getString(item.cost3, position)
        holder.title1.text = context.getString(item.title1, position)
        holder.title2.text = context.getString(item.title2, position)
        holder.title3.text = context.getString(item.title3, position)
        holder.category.text = context.getString(item.category, position+1)

    }

    override fun getItemCount(): Int = if (items.isEmpty()) 0 else items.size

}