package com.example.superheroes.Model.pojos

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.superheroes.Model.Powerstats
import com.example.superheroes.Model.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SuperHeroesRepository {
    private val service = RetrofitClient.getRetrofitClient()
//union de interfas mas el cliente( por eso le puso como nomrbe servicio )

    //la vieha confiable
    fun getDataFromServer() {
        val call = service.fetchAllSuperHeroes()
        call.enqueue(object  : Callback<List<Powerstats>> {
            override fun onFailure(call: Call<List<Powerstats>>, t: Throwable) {
                Log.e("ERROR", t.message.toString())
                            }

            override fun onResponse(
                call: Call<List<Powerstats>>,
                response: Response<List<Powerstats>>
            ) {

              when(response.code()) {
                  in 200..299 -> Log.d("RESPONDE", response.body().toString())
                  in 300..599  -> Log.d("RESPONDE", response.errorBody().toString())
                  else -> Log.d("ERROE", response.errorBody().toString())

              }
            }

        })
        //de forma autoamtica retrofit icupa un camino paralelo al usar enqueuqe
    }


}