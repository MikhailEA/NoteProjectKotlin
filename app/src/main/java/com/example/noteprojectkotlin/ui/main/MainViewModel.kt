package com.example.noteprojectkotlin.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val viewStateLiveData: MutableLiveData<String> = MutableLiveData() // private val viewStateLiveDate = MutableLiveData<String>

    init {
        viewStateLiveData.value = "Hello from ViewModel"
    }

    fun viewState() : LiveData<String> = viewStateLiveData


}