package com.example.a4_5_2_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    var TAG:String=MainActivity2::class.java.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initViews()
    }
    fun initViews(){
        var tv_id=findViewById<TextView>(R.id.tv_consul_id)

        var login: String? =intent.getStringExtra("login")

        Log.d(TAG,login.toString())

        tv_id.setText(login.toString())

    }
}