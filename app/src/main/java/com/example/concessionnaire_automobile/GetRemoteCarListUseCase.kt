package com.example.concessionnaire_automobile

import CarEntity

class GetRemoteCarListUseCase {
    private var repository = CarRepository()
    suspend fun execute(): List<CarEntity> {
        return repository.getRemoteCarList()
    }
}