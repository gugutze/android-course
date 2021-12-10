package com.example.myfirstapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CreditsAdapter(private val creditsWhoIsWho: List<String>) :
    RecyclerView.Adapter<CreditsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CreditsViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.credits_list_item, parent, false)
        return CreditsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CreditsViewHolder, position: Int) {
        val whoIsWho = creditsWhoIsWho[position]
        holder.bind(whoIsWho)
    }

    override fun getItemCount(): Int {
        return creditsWhoIsWho.size
    }
}