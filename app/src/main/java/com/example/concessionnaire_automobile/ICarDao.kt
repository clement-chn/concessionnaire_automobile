package com.example.concessionnaire_automobile

import CarEntity
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ICarDao {
    @Query("Select * FROM car_table")
    fun getAll(): List<CarEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(cars: List<CarEntity>)
}