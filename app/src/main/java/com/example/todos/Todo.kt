package com.example.todos

import java.util.*

data class Todo(val id: UUID = UUID.randomUUID(), var title: String = "", var desc: String = "", var isComplited: Boolean = false) {

}