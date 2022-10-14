package com.example.madpractical8_20012011177

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity(), Animation.AnimationListener {
    lateinit var alarmimgs: ImageView
    lateinit var heartimgs: ImageView
    lateinit var alarming_frameByFrameAnimation: AnimationDrawable
    lateinit var alarmimgAnimation: Animation
    lateinit var heart_frameByFrameAnimation: AnimationDrawable
    lateinit var heartAnimation: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alarmimgs = findViewById(R.id.alarmimages)
        alarmimgs.setBackgroundResource(R.drawable.alarm_image_list)
        alarming_frameByFrameAnimation = alarmimgs.background as AnimationDrawable
        alarmimgAnimation = AnimationUtils.loadAnimation(this, R.anim.alarm_animation)
        alarmimgAnimation.setAnimationListener(this)

        heartimgs = findViewById(R.id.heartImages)
        heartimgs.setBackgroundResource(R.drawable.heart_image_list)
        heart_frameByFrameAnimation = heartimgs.background as AnimationDrawable
        heartAnimation = AnimationUtils.loadAnimation(this, R.anim.heart_animation)
        heartAnimation.setAnimationListener(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)

        if (hasFocus) {
            alarming_frameByFrameAnimation.start()
            alarmimgs.startAnimation(alarmimgAnimation)

            heart_frameByFrameAnimation.start()
            heartimgs.startAnimation(heartAnimation)
        }
    }

    override fun onAnimationStart(p0: Animation?) {
        TODO("Not yet implemented")
    }

    override fun onAnimationEnd(p0: Animation?) {
        TODO("Not yet implemented")
    }

    override fun onAnimationRepeat(p0: Animation?) {
        TODO("Not yet implemented")
    }


}
