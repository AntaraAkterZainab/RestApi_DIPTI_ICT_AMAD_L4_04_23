package com.example.restapi_dipti_ict_amad_l4_04_23.viewModel_DIPTI_ICT_AMAD_L4_04_23

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restapi_dipti_ict_amad_l4_04_23.ApiInstance_DIPTI_ICT_AMAD_L4_04_23.apiService
import com.example.restapi_dipti_ict_amad_l4_04_23.Product_DIPTI_ICT_AMAD_L4_04_23
import kotlinx.coroutines.launch
class ProductViewModel_DIPTI_ICT_AMAD_L4_04_23:ViewModel() {

    private val _product = MutableLiveData<List<Product_DIPTI_ICT_AMAD_L4_04_23>>()
    val products:LiveData<List<Product_DIPTI_ICT_AMAD_L4_04_23>> get() = _product


    init {
        viewModelScope.launch {
            fetchroducts()
        }
    }

    private suspend fun fetchroducts() {             // apiService.getProducts()
        try {
            val response =  apiService.getProducts()
            _product.postValue(response)
        }catch (e:Exception){

        }
    }
}