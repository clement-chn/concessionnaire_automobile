package com.example.concessionnaire_automobile

data class CarDto {
    val make: String,
    val model: String,
    val year: Int,
    val picture: String,
    val equipments: List<String>
}