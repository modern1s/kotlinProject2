package com.sparta.demoproject.domain.todoApplication.controller

import com.sparta.demoproject.domain.todoApplication.dto.NewTodoApplicationResponse
import com.sparta.demoproject.domain.todoApplication.dto.NewTodoRequest
import com.sparta.demoproject.domain.todoApplication.dto.UpdateApplicationDescriptionRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/courses/{courseId}/applications")
@RestController
class CourseApplicationController {

    @PostMapping
    fun applyCourse(@PathVariable courseId: Long, newTodoRequest: NewTodoRequest): ResponseEntity<NewTodoApplicationResponse> {
        TODO("Not yet implemented")
    }

    @GetMapping()
    fun getApplicationList(@PathVariable courseId: Long): ResponseEntity<List<NewTodoApplicationResponse>> {
        TODO("Not yet implemented")
    }

    @GetMapping("/{applicationId}")
    fun getApplication(
        @PathVariable courseId: Long,
        @PathVariable applicationId: Long
    ): ResponseEntity<NewTodoApplicationResponse> {
        TODO("Not yet implemented")
    }

    @PatchMapping("/{applicationId}")
    fun updateApplicationStatus(
        @PathVariable courseId: Long,
        @PathVariable applicationId: Long,
        @RequestBody updateApplicationDescriptionRequest: UpdateApplicationDescriptionRequest
    ): ResponseEntity<NewTodoApplicationResponse> {
        TODO("Not yet implemented")
    }

}

// CourseApplicationController.kt