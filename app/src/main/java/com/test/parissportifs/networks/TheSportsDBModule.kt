package com.test.parissportifs.networks

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TheSportsDBModule {

    fun createTheSportsDBManager(): TheSportsDBService {
        val okHttpClient = OkHttpClient()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.thesportsdb.com/api/v1/json/$API_KEY/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(TheSportsDBService::class.java)
    }

    companion object {
        private const val API_KEY = "50130162"
    }
}