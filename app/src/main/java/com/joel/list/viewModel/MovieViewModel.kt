package com.joel.list.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joel.list.model.ApiService
import com.joel.list.model.Movie
import com.joel.list.model.MovieItem
import kotlinx.coroutines.launch

class MovieViewModel : ViewModel() {

    var carListResponse : List<MovieItem> by mutableStateOf(listOf())
    var errorMessage : String by  mutableStateOf("")

    fun getCarList(){
        viewModelScope.launch {
            val apiService = ApiService.getInstance()
            try {
                val carList = apiService.getCars()
                carListResponse = carList
            }
            catch ( e : Exception){
             errorMessage = e.message.toString()
            }
        }
    }




}