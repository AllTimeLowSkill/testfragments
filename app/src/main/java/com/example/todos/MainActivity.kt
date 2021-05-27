package com.example.todos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportFragmentManager.findFragmentById(R.id.list_container) == null) {
            val fragment = TodosList.newInstance()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, fragment)
                .commit()
        }

    }
}