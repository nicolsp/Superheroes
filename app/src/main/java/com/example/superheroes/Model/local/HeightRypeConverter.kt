package com.example.superheroes.Model.local

import androidx.room.TypeConverter
import com.google.gson.Gson

class HeightRypeConverter {

    @TypeConverter
    fun fromListToString(list: List<String>) = Gson().toJson(list)

@TypeConverter
fun jsonToList(value: String) = Gson().fromJson(value,Array<String>::class.java).toList()
}