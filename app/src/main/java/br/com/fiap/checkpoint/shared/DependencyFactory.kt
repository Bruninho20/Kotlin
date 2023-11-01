package br.com.fiap.checkpoint.shared

import br.com.fiap.checkpoint.data.CountriesService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

object DependencyFactory {

    private const val BASE_URL = "https://servicodados.ibge.gov.br/api/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val countriesService: CountriesService = retrofit.create(
        CountriesService::class.java
    )

    val timestamp = Date().time.toString()

//    fun createRepository(): MarvelRepository {
//        return MarvelRepositoryImpl(marvelService)
//    }
}