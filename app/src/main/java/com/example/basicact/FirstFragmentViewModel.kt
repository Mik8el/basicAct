package com.example.basicact

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstFragmentViewModel: ViewModel() {
    val type = MutableLiveData<String>()
    val counter = MutableLiveData<Int>()

    init {
        type.value = ""
        counter.value = 0
    }

    fun onIncrement() {
        counter.value = (counter.value)?.plus(1)

    }

}