package com.itproger.tohomeist.data.cards.api

import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface CardApi {

    @POST("/api/todo")
    fun getCardList(): Call<List<CardListResponse.CardListItemDto>>

}

