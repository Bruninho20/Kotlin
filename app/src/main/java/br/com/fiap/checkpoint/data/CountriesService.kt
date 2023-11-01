package br.com.fiap.checkpoint.data

import retrofit2.http.GET

interface CountriesService {

    @GET("/countries")
    suspend fun getCountries()
}