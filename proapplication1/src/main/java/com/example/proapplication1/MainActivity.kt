package com.example.proapplication1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proapplication1.databinding.ActivityMain3Binding


class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
//    }
    private var mBinding: ActivityMain3Binding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        mBinding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvMessage.setText("안녕하세요 박헌민입니다.")
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}