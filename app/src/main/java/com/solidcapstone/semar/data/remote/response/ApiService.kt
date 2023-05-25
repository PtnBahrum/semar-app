package com.solidcapstone.semar.data.remote.response

import com.solidcapstone.semar.data.PredictResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {

    @Multipart
    @POST("predict")
    fun postImage(
        @Part file : MultipartBody.Part,
    ): Call<PredictResponse>
}