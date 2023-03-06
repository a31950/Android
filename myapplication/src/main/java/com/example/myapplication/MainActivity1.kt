package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMain1Binding

class MainActivity1 : AppCompatActivity() {

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("park","onKeyUp")
        when(keyCode){
            KeyEvent.KEYCODE_A -> Log.d("park","A키를 눌렀네요")
        }
        return super.onKeyUp(keyCode, event)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("park","onKeyDown")
        return super.onKeyDown(keyCode, event)
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val binding = ActivityMain1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.checkbox7.setOnCheckedChangeListener(object:CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean){
                Log.d("park","체크박스 클릭")
        }
    })

    }
}