package com.senac.apirest.api

import retrofit2.http.GET

interface ProductApi {

    @GET("products")
    suspend fun getProducts(): ProductResponse

}
