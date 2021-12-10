package com.example.myfirstapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CreditsFragment : Fragment() {

    lateinit var creditsRecyclerView: RecyclerView
    lateinit var visitOdinButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val creditsWhoIsWho: List<String> = listOf(
            "Студент:\nКанаков Василий Борисович",
            "Преподаватель:\nНовопашенный Максим Витальевич",
            "Кураторы:\nМурсалов Эмиль Рашидович\n\n" + "и\n\n" + "Альшевский Павел Александрович"
        )

        val view = inflater.inflate(R.layout.fragment_credits, container, false)

        visitOdinButton=view.findViewById(R.id.visit_odin_button)

        creditsRecyclerView = view.findViewById(R.id.credits_recycler_view)
        creditsRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        creditsRecyclerView.adapter = CreditsAdapter(creditsWhoIsWho)

        visitOdinButton.setOnClickListener{
            val link = Uri.parse("https://odin.study/")
            val intent=Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        return view
    }
}