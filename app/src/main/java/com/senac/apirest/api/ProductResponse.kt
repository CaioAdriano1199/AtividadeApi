package com.senac.apirest.api

import com.senac.apirest.model.Product

data class ProductResponse(
    val products: List<Product>,
    val total: Int,
    val skip: Int,
    val limit: Int
)
