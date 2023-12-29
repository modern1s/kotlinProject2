package com.sparta.demoproject.domain.todolist.controller


import com.sparta.demoproject.domain.todolist.dto.CreateTodoListRequest
import com.sparta.demoproject.domain.todolist.dto.TodoResponse
import com.sparta.demoproject.domain.todolist.dto.UpdateTodoListRequest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/todos")
@RestController
class TodoListController {

    @GetMapping()
    fun getTodoList(): ResponseEntity<List<TodoResponse>> {
        TODO()
    }

    @GetMapping("/{todosId}")
    fun getTodoDetail(@PathVariable todosId: Long): ResponseEntity<TodoResponse> {
        TODO()
    }

    @PostMapping
    fun createCourse(@RequestBody createCourseRequest: CreateTodoListRequest): ResponseEntity<TodoResponse> {
        TODO()
    }

    @PutMapping("/{todosId}")
    fun updateCourse(@PathVariable todosId : Long,
                     @RequestBody updateCourseReqeust: UpdateTodoListRequest
    ): ResponseEntity<TodoResponse> {
        TODO()

    }

    @DeleteMapping("/{todosId}")
    fun deleteCourse(@PathVariable todosId: Long){
        TODO()
    }
}
