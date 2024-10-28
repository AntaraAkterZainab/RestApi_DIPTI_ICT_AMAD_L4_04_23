package com.example.restapi_dipti_ict_amad_l4_04_23

import com.example.restapi_dipti_ict_amad_l4_04_23.Adapter_DIPTI_ICT_AMAD_L4_04_23.ProductAdapter_DIPTI_ICT_AMAD_L4_04_23
import retrofit2.http.GET


interface ApiService_DIPTI_ICT_AMAD_L4_04_23 {

    @GET("products")
    suspend fun getProducts():List<Product_DIPTI_ICT_AMAD_L4_04_23>

}