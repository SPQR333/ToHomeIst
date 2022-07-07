package com.itproger.tohomeist.data.cards.api

import retrofit2.Call
import retrofit2.http.GET

interface CardApi {
    @GET("./todo")
    fun getCardList() : Call<List<CardListResponse.CardListItemDto>>
}