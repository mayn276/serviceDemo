package com.example.servicedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.servicedemo.MyBackGroundService.Companion.MARKS
import com.example.servicedemo.MyBackGroundService.Companion.NAME
import com.example.servicedemo.MyBackGroundService.Companion.TAG
import com.example.servicedemo.databinding.ActivityMainBinding
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val serviceIntent = Intent(this,MyBackGroundService::class.java)
        serviceIntent.putExtra(NAME,"Alex")
        serviceIntent.putExtra(MARKS,"78")

        binding.btnStart.setOnClickListener {
            Log.i(TAG,"Starting service")
            startService(serviceIntent)
        }

        binding.btnStop.setOnClickListener {
            Log.i(TAG,"Stopping service")
            stopService(serviceIntent)
        }
    }
}