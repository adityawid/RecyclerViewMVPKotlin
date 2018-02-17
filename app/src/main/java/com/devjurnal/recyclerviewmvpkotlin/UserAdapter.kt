package com.devjurnal.recyclerviewmvpkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by DevJurnal on 2/17/18.
 */
class UserAdapter : RecyclerView.Adapter<UserAdapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder{
        var view = LayoutInflater.from(parent?.context).inflate(R.layout.item_user, parent,false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    }
}