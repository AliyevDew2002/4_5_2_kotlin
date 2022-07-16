package com.example.a4_5_2_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var id:EditText; lateinit var pw:EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        id=findViewById(R.id.et_user_id)
        pw=findViewById(R.id.et_user_pw)
        var login_b=findViewById<Button>(R.id.b_login_id)
        login_b.setOnClickListener{
            startActivity()
        }
    }
    fun startActivity(){
        var intent= Intent(this,MainActivity2::class.java)
        var login:String="ID="+id.getText().toString()+", Password="+pw.getText().toString()
        intent.putExtra("login",login)
        startActivity(intent)
    }
}