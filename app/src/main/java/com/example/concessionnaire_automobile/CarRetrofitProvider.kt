package com.example.concessionnaire_automobile

class CarRetrofitProvider {
    companion object {
        private const val BASE_URL = "https://gist.githubusercontent.com/"
    }

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .build()

    private val apiService: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getCarApiService(): ICarApi {
        return apiService.create(ICarApi::class.java)
    }
}