package com.example.taskslistapp.ui.tasks

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.taskslistapp.data.TaskDao


class TasksViewModel @ViewModelInject constructor(
    private val taskDao: TaskDao
) : ViewModel(){
}