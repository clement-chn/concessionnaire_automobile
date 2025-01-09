package com.example.concessionnaire_automobile

import CarEntity

class CarRepository: ICarsRepository {
    private val fetchCarDataRequest = FetchCarDataRequest()
    override suspend fun getRemoteCarList(): List<CarEntity> {
        return fetchCarDataRequest.execute()
    }
}