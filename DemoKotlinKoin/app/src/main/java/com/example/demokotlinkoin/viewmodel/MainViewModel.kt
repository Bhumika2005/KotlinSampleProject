package com.example.demokotlinkoin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.demokotlinkoin.repository.TodoRepository
import com.example.demokotlinkoin.repository.entity.ToDo
import kotlinx.coroutines.Dispatchers

class MainViewModel : ViewModel() {
    private val todoRepository : TodoRepository = TodoRepository()

    fun getFirstToDo():LiveData<ToDo> {
    }

}