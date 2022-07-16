package com.itproger.tohomeist.home

import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.itproger.tohomeist.data.cards.api.CardApi
import com.itproger.tohomeist.data.cards.api.CardApp
import com.itproger.tohomeist.data.cards.api.CardListResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CardListViewModel : AndroidViewModel(CardApp.application!!) {

    fun onCardListRequested() {
        val service: CardApi = CardApp.retrofit.create(CardApi::class.java)
        service.getCardList().enqueue(
            object : Callback<List<CardListResponse.CardListItemDto>> {
                override fun onResponse(
                    call: Call<List<CardListResponse.CardListItemDto>>,
                    response: Response<List<CardListResponse.CardListItemDto>>
                ) {
                    Log.d("ServerResponse", "No responses")
                    if (response.isSuccessful) {
                        val items = response.body()
                        Log.d("ServerResponse", items.toString())
                    }
                }

                override fun onFailure(
                    call: Call<List<CardListResponse.CardListItemDto>>,
                    t: Throwable
                ) {
                    Log.d("ServerResponse", "No response")
                }
            }
        )
    }
}