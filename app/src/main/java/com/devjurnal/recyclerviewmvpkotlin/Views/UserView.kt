package com.devjurnal.recyclerviewmvpkotlin.Views

import com.devjurnal.recyclerviewmvpkotlin.Models.Users
import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by DevJurnal on 2/17/18.
 */
interface UserView {

    // jika sukses menampilkan arraylist ke adapter
    fun Success (datas : ArrayList<Users>)

    fun Error(pesan : String)
}