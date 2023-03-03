package com.example.myapplication

import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return super.onTouchEvent(event)
    }
}