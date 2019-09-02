package com.example.mylibrary

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

/**
 *  Created by yangyeah on 2019/8/20
 *
 *  describe:
 */
class ModuleBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.i("receiver","ModuleBroadcast==onReceive")
        if (intent!!.action == "qding://www.zxj.com/notice") {
            val content = intent.getStringExtra("data")
            Log.i("receiver", content)
        }

    }
}