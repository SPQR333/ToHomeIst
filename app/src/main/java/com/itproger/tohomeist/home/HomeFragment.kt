package com.itproger.tohomeist.home

import android.R.id
import android.app.Application
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.itproger.tohomeist.R
import com.itproger.tohomeist.data.cards.api.CardApi
import com.itproger.tohomeist.data.cards.api.CardApp
import com.itproger.tohomeist.data.cards.api.CardListResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeFragment : Fragment(R.layout.home_cardlist_fragment) {

    private val RcCard: RecyclerView = TODO()

    lateinit var binding: HomeFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    private lateinit var textView: TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            val recyclerView: RecyclerView = binding.RcCard
            recyclerView.layoutManager = LinearLayoutManager(context)
        }
        onCardListRequested()


        textView = view.findViewById(R.id.Tvres) as TextView
        var textView: TextView


    }


}

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
                    Log.d("HamilMicher", items.toString())
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
