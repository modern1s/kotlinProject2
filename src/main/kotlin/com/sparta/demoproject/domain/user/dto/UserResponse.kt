package com.teamsparta.courseregistration.domian.user.dto

data class UserResponse(
    val id: Long,
    val email: String,
    val nickname: String,
    val role: String,
)