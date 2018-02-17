package com.devjurnal.recyclerviewmvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.devjurnal.recyclerviewmvpkotlin.Models.Users
import com.devjurnal.recyclerviewmvpkotlin.Presenters.UserPresenterImp
import com.devjurnal.recyclerviewmvpkotlin.Views.UserView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), UserView {
    lateinit var presenter : UserPresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()
    }

    private fun initView() {
        btnSubmit.setOnClickListener {
            if (edtNama.text.toString().isNotEmpty() || edtAlamat.text.toString().isNotEmpty()){
                presenter.addList(edtNama.text.toString(), edtAlamat.text.toString())
            }else {
                Error("form kosong")
            }
        }
    }

    private fun initPresenter() {
        presenter = UserPresenterImp(this)
    }

    override fun Success(datas: ArrayList<Users>) {
        var adapter = UserAdapter(datas)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.adapter = adapter
    }

    override fun Error(pesan: String) {
        Toast.makeText(applicationContext, ""+pesan, Toast.LENGTH_SHORT).show()
    }
}
