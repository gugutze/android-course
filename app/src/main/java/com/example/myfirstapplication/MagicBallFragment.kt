package com.example.myfirstapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

private const val LAST_SHAKED_IMAGE = "Image Item"

class MagicBallFragment : Fragment() {

    lateinit var magicBallView: ImageView
    lateinit var shakeBallButton: Button
    private val magicBallList:List<Int> = listOf(
        R.drawable.magic_ball_1,
        R.drawable.magic_ball_2,
        R.drawable.magic_ball_3,
        R.drawable.magic_ball_4,
        R.drawable.magic_ball_5
    )
    var lastShakedImageRes = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view =  inflater.inflate(R.layout.fragment_magic_ball, container, false)

        magicBallView=view.findViewById(R.id.magic_ball_view)
        shakeBallButton=view.findViewById(R.id.shake_ball_button)

        if (savedInstanceState != null)
            magicBallView.setImageResource(savedInstanceState.getInt(LAST_SHAKED_IMAGE))

        shakeBallButton.setOnClickListener {
            lastShakedImageRes=magicBallList.random()
        magicBallView.setImageResource(lastShakedImageRes)
        }

        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_SHAKED_IMAGE, lastShakedImageRes)
    }

}