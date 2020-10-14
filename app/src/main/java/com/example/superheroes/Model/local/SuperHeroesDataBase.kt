package com.example.superheroes.Model.local

import android.content.Context
import androidx.room.*
import okhttp3.internal.readFieldOrNull
@TypeConverters(HeightRypeConverter::class)
@Database(entities = [SuperHeroesEntity::class], version = 1)
abstract class SuperHeroesDataBase : RoomDatabase() {

    //dao
    abstract fun superHeroesDao(): SuperHeroesDao

companion object {
    @Volatile
    private var INSTANCE: SuperHeroesDataBase? = null

    fun getDatabase(context : Context): SuperHeroesDataBase {
        val tempIntance = INSTANCE
        if(tempIntance != null){
            return tempIntance
        }
        synchronized(this){
            val instance = Room.databaseBuilder(context,
                SuperHeroesDataBase::class.java,"SuperHeroDB").build()
            INSTANCE = instance
            return instance
        }
    }
}

}
