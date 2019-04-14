package com.takosu.msgshareapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.takosu.msgshareapp.Constants
import com.takosu.msgshareapp.R
import com.takosu.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    companion object {
        val TAG: String = SecondActivity::class.java.simpleName
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle: Bundle? = intent.extras
        bundle?.let {
            val msg = bundle!!.getString(Constants.USER_MSG_KEY)
//        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
            showToast(msg)
            txcUserMsg.text = msg

            txvlocation.text = "Empty"
        }


    }
}