package com.example.mvpdemo.presenter

import com.example.mvpdemo.interfaces.PInterface
import com.example.mvpdemo.model.MainActivityModel

class MainActivityPresenter(view:PInterface.DataView):PInterface.Presenter {
   private var dataView:PInterface.DataView=view
    private var model:PInterface.DataModel=MainActivityModel()

    init {
        dataView.initView()
    }
    override fun increementValue() {
        model.increementCounter()
        dataView.updateView()
    }

    override fun getCounter(): String {
        return model.getCounter().toString()
    }
}