package com.example.restapi_dipti_ict_amad_l4_04_23


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiInstance_DIPTI_ICT_AMAD_L4_04_23 {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    val apiService = retrofit.create(ApiService_DIPTI_ICT_AMAD_L4_04_23::class.java)

}