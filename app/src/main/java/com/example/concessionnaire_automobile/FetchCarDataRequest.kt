package com.example.concessionnaire_automobile

import CarEntity
import android.util.Log

class FetchCarDataRequest {
    private var carMapper = TransformCarDtoToCarEntityMapper()
    private var carRetrofitProvider = CarRetrofitProvider()
    suspend fun execute():List<CarEntity> {
        try {
            val response = carRetrofitProvider.getCarApiService().getCarList().execute()
            if (response.isSuccessful) {
                val carDtoList = response.body() ?: emptyList()
                return carMapper.execute(carDtoList)
            } else {
                Log.e("Car Repository", "Failed to fetch cars: ${response.errorBody()}")
            }
        } catch (e:Exception) {
            Log.e("CarRepository", "Error fetching cars", e)
        }
        return emptyList()
    }
}