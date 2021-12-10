package com.example.myfirstapplication

import android.view.TextureView
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CreditsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val creditsWhoIsWhoTextView: TextView =
        itemView.findViewById(R.id.credits_who_is_who_text_view)

    fun bind(name: String) {
        creditsWhoIsWhoTextView.text = name
    }
}