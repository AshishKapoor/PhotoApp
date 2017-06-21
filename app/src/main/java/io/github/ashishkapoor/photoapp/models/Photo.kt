package io.github.ashishkapoor.photoapp.models

import java.io.Serializable

/**
 * Created by ashishkapoor on 21/06/17.
 */
data class Photo(
        val id: String,
        val likes: Int,
        val favorites: Int,
        val tags: String,
        val previewURL: String,
        val webformatURL: String) : Serializable {

}

