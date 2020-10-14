package com.example.superheroes.Model.local

import androidx.annotation.NonNull
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "super_heroes_table")
class SuperHeroesEntity(@PrimaryKey  @NonNull val id: Int,
                        val imageXs: String,
                        val imageLg: String,
                        val name: String,
                        val alterEgos: String,
                       @Embedded val height : List<String>

)