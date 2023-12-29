package com.sparta.demoproject.domain.todoApplication.dto

import com.sparta.demoproject.domain.todolist.dto.TodoResponse
import com.teamsparta.courseregistration.domian.user.dto.UserResponse
import java.util.Date

data class NewTodoApplicationResponse(
    val id: Long,
    val todo: TodoResponse,
    val user: UserResponse,
    val date: Date,
)