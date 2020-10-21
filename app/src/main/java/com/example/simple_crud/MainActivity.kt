package com.example.simple_crud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import android.R.layout.simple_list_item_1
import android.widget.Toast
import androidx.core.view.get

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //array list
        val list_item = arrayListOf("Samsung A0","Sony MI","Oppo F1","XiaoMi Ai")
        val list_price = arrayListOf(30000,50000,60000,80000)
        //list view operate
        lv_1.adapter = ArrayAdapter(this,simple_list_item_1,list_item )
        lv_1.setOnItemClickListener { parent, view, position, id ->
            et_1.setText(list_item[position]) }
//            Toast.makeText(this,"Item ${list_item[position]}",Toast.LENGTH_SHORT).show()}

        btn_1.setOnClickListener {
            list_item.add(et_1.text.toString())
        }
        btn_2.setOnClickListener {
            list_item.remove(et_1.text.toString())
        }
    }

}
