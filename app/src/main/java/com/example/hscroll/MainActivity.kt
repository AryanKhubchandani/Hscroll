package com.example.hscroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
//import com.example.hscroll.version
//import com.example.hscroll.utility
//import com.example.hscroll.adapter
import com.example.hscroll.adapter.adapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (utility.isOnline(this)) {
            displayList()
        } else {
            Toast.makeText(this, R.string.no_internet, Toast.LENGTH_SHORT).show()
        }
    }

    private fun displayList() {
        val version = ArrayList<version>()
        version.addAll(com.example.hscroll.version.getList())
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter(version)
    }
}