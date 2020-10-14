package com.example.superheroes.Model.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SuperHeroesDao {

    @Insert
    fun insertAllSuperHeroes(mList: List<SuperHeroesEntity>)

    @Query("SELECT * FROM super_heroes_table ")
    fun shoAllSuperHeroes(): LiveData<List<SuperHeroesEntity>>

    @Query("SELECT *FROM super_heroes_table WHERE id =:mID")
    fun showOnSuperHeroesBy(mID : Int) : LiveData<SuperHeroesEntity>

}