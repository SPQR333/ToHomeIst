package com.itproger.tohomeist.home_screen

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.itproger.tohomeist.data.cards.api.CardApi
import com.itproger.tohomeist.data.cards.api.CardApp
import com.itproger.tohomeist.data.cards.api.CardListResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CardListViewModel(application: Application) : AndroidViewModel(application) {

    override fun onCleared() {
        super.onCleared()
    }
    fun cardList() {
        val service: CardApi = CardApp.retrofit.create(CardApi::class.java)
        service.getCardList().enqueue(object : Callback<List<CardListResponse.CardListItemDto>> {
            override fun onResponse(
                call: Call<List<CardListResponse.CardListItemDto>>,
                response: Response<List<CardListResponse.CardListItemDto>>
            ) {
                if(response.isSuccessful) {
                    val CardListItem = response.body()

                }
            }

            override fun onFailure(
                call: Call<List<CardListResponse.CardListItemDto>>,
                t: Throwable
            ) {
                TODO("Not yet implemented")
            }

        })
    }

}