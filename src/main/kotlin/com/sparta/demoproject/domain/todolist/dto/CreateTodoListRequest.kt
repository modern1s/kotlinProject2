package com.sparta.demoproject.domain.todolist.dto

data class CreateTodoListRequest(
    val userId: Long,
    val title: String,
    val description: String?,

    )
