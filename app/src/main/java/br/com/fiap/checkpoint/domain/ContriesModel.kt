package br.com.fiap.checkpoint.domain

import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

data class ContriesModel(
    @SerializedName("data")
    val data: CoutriesDataModel
)

data class CoutriesDataModel(
    @SerializedName("results")
    val results: List<CountriesDataResultModel>
)

@Parcelize
data class CountriesDataResultModel(

)
