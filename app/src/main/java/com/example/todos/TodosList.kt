package com.example.todos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders


class TodosList : Fragment() {

    private val todosViewModel: TodosViewModel by lazy {
        ViewModelProviders.of(this).get(TodosViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_todos_list, container, false)
    }

    companion object {
        fun newInstance(): TodosList {
            return TodosList()
        }
    }

}