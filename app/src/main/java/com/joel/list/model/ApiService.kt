package com.joel.list.model

import com.joel.list.utils.ApiConstant
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {

    @GET(ApiConstant.END_POINT)
    suspend fun getCars(): List<MovieItem>

    companion object{
        private var apiService : ApiService ?= null
        fun getInstance () : ApiService{
            if (apiService == null){
                apiService = Retrofit.Builder()
                    .baseUrl(ApiConstant.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApiService::class.java)
            }
            return apiService!!
        }
    }
}
