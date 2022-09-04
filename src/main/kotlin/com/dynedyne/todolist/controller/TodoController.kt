package com.dynedyne.todolist.controller

import com.dynedyne.todolist.service.TodoService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todo")
class TodoController(private val todoService: TodoService) {
    @GetMapping
    fun getTodos() = todoService.getTodos()

    @PostMapping
    fun insertTodo(@RequestBody todoRequest: TodoRequest) = todoService.insertTodo(todoRequest.content)

    @PutMapping(path = ["/complete/{todoId}"])
    fun completeTodo(@PathVariable(value = "todoId") todoId: Long) = todoService.completeTodo(todoId)

    @PutMapping(path = ["/important/{todoId}"])
    fun importantTodo(@PathVariable(value = "todoId") todoId: Long) = todoService.importantTodo(todoId)

    @DeleteMapping(path = ["/{todoId}"])
    fun deleteTodo(@PathVariable(value = "todoId") todoId: Long) = todoService.deleteTodo(todoId)
}
