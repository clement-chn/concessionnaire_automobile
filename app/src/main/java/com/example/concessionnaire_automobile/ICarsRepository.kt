package com.example.concessionnaire_automobile

import CarEntity

interface ICarsRepository {
    suspend fun getRemoteCarList(): List<CarEntity>
}