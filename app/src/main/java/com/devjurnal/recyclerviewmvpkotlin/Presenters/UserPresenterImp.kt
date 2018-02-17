package com.devjurnal.recyclerviewmvpkotlin.Presenters

import com.devjurnal.recyclerviewmvpkotlin.Models.Users
import com.devjurnal.recyclerviewmvpkotlin.Views.UserView

/**
 * Created by DevJurnal on 2/17/18.
 */
class UserPresenterImp : UserPresenter {

    var userView : UserView? = null

    constructor(userView: UserView?) {
        this.userView = userView
    }

    override fun addList(nama: String, alamat: String) {

        // create model
        var userUser = Users(nama,alamat)

        // deklarasi array
        var data : ArrayList<Users>? = null

        // insert model ke array
        data?.add(userUser)

        userView?.Success(data!!)

    }
}