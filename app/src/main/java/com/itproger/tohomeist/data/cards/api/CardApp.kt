package com.itproger.tohomeist.data.cards.api

import android.app.Application
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CardApp : Application() {
    lateinit var cardApi: CardApi
    companion object {
        var application:Application? = null
        val httpLoggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()


        val baseUrl = HttpUrl.Builder()
            .scheme("http")
            .host("10.0.2.2")
            .port(8000)
            .build()
        val retrofit = Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }


    override fun onCreate() {
        super.onCreate()
        application = this

    }
}