package com.senac.apirest.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.senac.apirest.api.ApiClient
import com.senac.apirest.model.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProductViewModel: ViewModel()  {

    val api = ApiClient.productApi

    private val _products = MutableStateFlow<List<Product>>(emptyList())

    val products : StateFlow<List<Product>> = _products.asStateFlow()

    fun loadProducts() {
        viewModelScope.launch {
            api.getProducts()


        }
    }
}