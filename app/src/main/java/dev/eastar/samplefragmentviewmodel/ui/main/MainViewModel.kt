package dev.eastar.samplefragmentviewmodel.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var _list = MutableLiveData<MutableList<String>>(mutableListOf())
    val list : LiveData<MutableList<String>> get() = _list
    fun add(item : String){
//        android.util.Log.e("viewmodel", "add")
//        android.util.Log.e("viewmodel", "before:"+_list.value.hashCode().toString() )
        _list.value?.add(item)
//        android.util.Log.e("viewmodel", ""+_list.value.toString() )
//        android.util.Log.e("viewmodel", "after"+_list.value.hashCode().toString() )

        _list.value = _list.value
    }
}