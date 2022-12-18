package com.zeynepaslierhan.memorygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView

class BasitLoadingScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basit_loading_screen)

        val progressBar = findViewById<ProgressBar>(R.id.progress_bar)
        val textView = findViewById<TextView>(R.id.textView)
        val selected = zorluk_secActivity()
        val activity = selected.selected_activity

        progressBar.max = 100
        progressBar.scaleY = 3F
        val anim = ProgressBarAnimation(
            this,progressBar,textView,0F,100F,activity
        )
        anim.duration=8000
        progressBar.animation = anim
    }
}