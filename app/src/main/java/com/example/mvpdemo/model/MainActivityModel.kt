package com.example.mvpdemo.model

import com.example.mvpdemo.interfaces.PInterface

class MainActivityModel:PInterface.DataModel {
    private var counter:Int=0
    override fun increementCounter() {
        counter++
    }

    override fun getCounter(): Int {
        return counter
    }
}