package com.althaus.dev.project04_cartelera.data.network

import com.althaus.dev.project04_cartelera.data.model.MovieResponse
import com.althaus.dev.project04_cartelera.utils.ApiKeyManager.getTmdbApiKey
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {
    @GET("movie/now_playing")
    suspend fun getNowPlayingMovies(
        @Query("language") language: String = "es-ES",
        @Query("page") page: Int = 1,
        @Query("api_key") apiKey: String = getTmdbApiKey()
    ): Response<MovieResponse>
}
