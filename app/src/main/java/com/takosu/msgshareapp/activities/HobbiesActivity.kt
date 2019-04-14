package com.takosu.msgshareapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.takosu.msgshareapp.adapters.HobbiesAdapter
import com.takosu.msgshareapp.R
import com.takosu.msgshareapp.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*


class HobbiesActivity : AppCompatActivity() {
    companion object {
        val TAG: String = HobbiesActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setupRecyclerView()

    }

    private fun setupRecyclerView() {

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        recyclerView.adapter = adapter
    }
}