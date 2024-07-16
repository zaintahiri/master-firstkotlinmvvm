package com.example.mvpdemo.interfaces

class PInterface {

    interface DataView{
        fun initView()
        fun updateView()
    }
    interface Presenter{
        fun increementValue()
        fun getCounter():String
    }

    interface DataModel{
        fun increementCounter()
        fun getCounter():Int
    }
}