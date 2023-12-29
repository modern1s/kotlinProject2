package com.sparta.demoproject.domain.todolist.dto

import java.util.Date

data class TodoResponse (
    val id: Long,
    val userId : Long,
    val title : String,
    val description: String?,
    val date: Date,
)