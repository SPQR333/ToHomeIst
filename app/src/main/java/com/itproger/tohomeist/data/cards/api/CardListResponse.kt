package com.itproger.tohomeist.data.cards.api

import com.google.gson.annotations.SerializedName
import retrofit2.Retrofit

data class CardListResponse(val items: CardListItem) {

    data class CardListItemDto(

        @SerializedName("title")
        val title: String,

        @SerializedName("id")
        val id: Int,

        @SerializedName("description")
        val description: String,

        @SerializedName("status")
        val status: Char,
    )

    data class CardListItem(
        val title: String,
        val id: Int,
        val description: String,
        val status: Char,
    )
}
