package com.example.servicedemo


import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyBackGroundService :Service() {

    init {
        Log.i("MYTAg","Services has been Created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("MYTAG","Service Started")
        return START_STICKY
    }
    override fun onBind(intent: Intent?): IBinder? = null

    override fun onDestroy() {
        Log.i("MYTAG","Destroying...")
        super.onDestroy()
    }
}