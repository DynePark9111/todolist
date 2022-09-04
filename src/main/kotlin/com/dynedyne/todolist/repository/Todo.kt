package com.dynedyne.todolist.repository

import org.hibernate.annotations.ColumnDefault
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EntityListeners
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Todo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    @ColumnDefault("false")
    var completed: Boolean = false,

    @Column(nullable = false)
    @ColumnDefault("false")
    var important: Boolean = false,

    @Column(nullable = false)
    var author: String = "guest",

    @Column(nullable = false)
    var content: String,

    @Column(nullable = false, updatable = false)
    @CreatedDate
    val createdDate: LocalDateTime? = LocalDateTime.now(),

    @Column(nullable = false)
    @LastModifiedDate
    var modifiedDate: LocalDateTime? = LocalDateTime.now(),
)