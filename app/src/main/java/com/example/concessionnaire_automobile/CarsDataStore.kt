package com.example.concessionnaire_automobile

import CarEntity

class CarsDataStore: ICarsDataStore {
    private var carDao = ShowRoomApplication.carsDatabase.iCarDao()

    override fun getSavedCarList(): List<CarEntity?> {
        return carDao.getAll()
    }

    override suspend fun insertAll(cars: List<CarEntity>) {
        carDao.insertAll(cars)
    }
}

