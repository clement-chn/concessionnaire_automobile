package com.example.concessionnaire_automobile

import CarEntity
import android.app.Application
import androidx.lifecycle.AndroidViewModel

class CarViewModel(application: Application) : AndroidViewModel(application) {
    private val getRemoteCarListUseCase = GetRemoteCarListUseCase()

    val carList = MutableLiveDate<List<CarEntity>>()

    fun refreshCars() {
        viewModelScope.launch {
            val cars = getRemoteCarListUseCase.execute()
            carList.postValue(cars)
        }
    }
}