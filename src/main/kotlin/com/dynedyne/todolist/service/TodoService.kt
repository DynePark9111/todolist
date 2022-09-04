package com.dynedyne.todolist.service

import com.dynedyne.todolist.repository.Todo
import com.dynedyne.todolist.repository.TodoRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class TodoService(private val todoRepository: TodoRepository) {
    fun getTodos() = todoRepository.findAll()

    fun insertTodo(content: String): Todo = todoRepository.save(Todo(content = content))

    fun completeTodo(todoId: Long): Todo {
        val todo = todoRepository.findByIdOrNull(todoId) ?: throw Exception()
        todo.completed = !todo.completed
        return todoRepository.save(todo)
    }

    fun importantTodo(todoId: Long): Todo {
        val todo = todoRepository.findByIdOrNull(todoId) ?: throw Exception()
        todo.important = !todo.important
        return todoRepository.save(todo)
    }



    fun deleteTodo(todoId: Long) = todoRepository.deleteById(todoId)
}