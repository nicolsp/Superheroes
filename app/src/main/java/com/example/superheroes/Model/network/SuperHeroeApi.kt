package com.example.superheroes.Model.network

import com.example.superheroes.Model.Powerstats
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface SuperHeroeApi {

    //vieja confiable
    @GET("all.json")
    fun fetchAllSuperHeroes(): Call<List<Powerstats>>


    //Coroutines( ambos metodos haran lo mismo )

    @GET("all.json")
    suspend fun fetchAllSuperheroeswithCoroutines(): Response<List<Powerstats>>


}