package com.example.concessionnaire_automobile

import CarEntity

class GetSavedCarListUseCase {
    private var carDataStore = CarsDataStore()

    fun execute(): List<CarEntity> {
        return carDataStore.getSavedCarList().mapNotNull{it}
    }
}