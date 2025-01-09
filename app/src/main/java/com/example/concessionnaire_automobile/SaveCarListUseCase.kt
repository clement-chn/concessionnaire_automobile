package com.example.concessionnaire_automobile

import CarEntity

class SaveCarListUseCase {
    private var carsDataStore = CarsDataStore()

    suspend fun execute(carList: List<CarEntity>) {
        carsDataStore.insertAll(carList)
    }
}