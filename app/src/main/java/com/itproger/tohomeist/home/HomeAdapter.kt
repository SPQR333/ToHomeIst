package com.itproger.tohomeist.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.itproger.tohomeist.R
import com.itproger.tohomeist.databinding.CardItemBinding
import com.itproger.tohomeist.models.Card

class HomeAdapter(private val names: List<String>) :
    RecyclerView.Adapter<HomeAdapter.CardViewHolder>() {

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val largeTextView: TextView = itemView.findViewById(R.id.Tvres)

        val binding = CardItemBinding.bind(itemView)
        val userList = ArrayList<Card>()


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.card_item, parent, false)
        return CardViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.largeTextView.text = names[position]


    }

    override fun getItemCount(): Int {
        return names.size

    }


}