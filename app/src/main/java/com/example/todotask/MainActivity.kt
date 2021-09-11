package com.example.todotask

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mTaskAdapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        mTaskAdapter = TaskAdapter(this@MainActivity)

        listView1.setOnItemClickListener { parent, view, position, id ->
            // listViewをタップ時
        }

        listView1.setOnItemLongClickListener{ parent, view, postion, id ->
            // listViewを長押
            true
        }

        reloadListView()
    }

    private fun reloadListView() {
        val taskList = mutableListOf("aaaaaa","bbbbb","ccccc")
        mTaskAdapter.taskList = taskList
        listView1.adapter = mTaskAdapter
        mTaskAdapter.notifyDataSetChanged()
    }

}
