package com.devjurnal.recyclerviewmvpkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devjurnal.recyclerviewmvpkotlin.Models.Users
import kotlinx.android.synthetic.main.item_user.view.*
import kotlin.collections.ArrayList

/**
 * Created by DevJurnal on 2/17/18.
 */
class UserAdapter(data: ArrayList<Users>) : RecyclerView.Adapter<UserAdapter.MyHolder>() {

    lateinit var ambilData : ArrayList<Users>
    init {
        this.ambilData = data
    }




    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder{
        var view = LayoutInflater.from(parent?.context).inflate(R.layout.item_user, parent,false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return ambilData.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(ambilData, position)
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(ambilData: ArrayList<Users>, position: Int) {

            itemView.tvItemNama.text = ambilData.get(position).nama
            itemView.tvItemAlamat.text = ambilData.get(position).alamat
        }

    }
}