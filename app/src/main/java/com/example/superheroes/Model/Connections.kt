package com.example.superheroes.Model


import com.google.gson.annotations.SerializedName

data class Connections(
    @SerializedName("groupAffiliation")
    val groupAffiliation: String,
    @SerializedName("relatives")
    val relatives: String
)