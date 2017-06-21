package io.github.ashishkapoor.photoapp.api

import io.github.ashishkapoor.photoapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by ashishkapoor on 21/06/17.
 */
interface PhotoAPI {
    @GET("?key=5697386-b2e6e8635cf5a20e05230cbba&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}