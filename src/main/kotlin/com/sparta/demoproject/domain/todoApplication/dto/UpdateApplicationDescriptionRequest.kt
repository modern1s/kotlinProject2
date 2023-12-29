package com.sparta.demoproject.domain.todoApplication.dto

import org.springframework.context.annotation.Description

data class UpdateApplicationDescriptionRequest(
    val description: String?,
)