package com.example.todos

import androidx.lifecycle.ViewModel

class TodosViewModel : ViewModel() {
    val todos = mutableListOf<Todo>()

    init {
        for (i in 0 until 100) {
            val todo = Todo()
            todo.title = "title #${i + 1}"
            todos += todo
        }
    }
}