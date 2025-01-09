package com.example.concessionnaire_automobile

import CarEntity

interface ICarsDataStore {
    fun getSavedCarList(): List<CarEntity?>

    suspend fun insertAll(cars: List<CarEntity>)
}