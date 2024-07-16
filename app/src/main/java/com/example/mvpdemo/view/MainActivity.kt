package com.example.mvpdemo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.mvpdemo.R
import com.example.mvpdemo.interfaces.PInterface
import com.example.mvpdemo.presenter.MainActivityPresenter

class MainActivity : AppCompatActivity(),PInterface.DataView {

    private var presenter:MainActivityPresenter?=null
    lateinit var btn:Button
    lateinit var result:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn=findViewById<Button>(R.id.btn)
        result=findViewById<TextView>(R.id.result)
        presenter=MainActivityPresenter(this)
    }

    override fun initView() {
        if(presenter!=null){
            result.text=presenter?.getCounter().toString()
        }
        btn.setOnClickListener {
            presenter?.increementValue()
        }
    }

    override fun updateView() {
        result.text=presenter?.getCounter().toString()
    }
}