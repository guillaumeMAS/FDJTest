package com.test.parissportifs.networks

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TheSportsDBService {

    @GET("all_leagues.php")
    fun getAllLeagues(): Call<TheSportsDBManager.GetAllLeaguesObject>

    @GET("search_all_teams.php")
    fun getAllTeamsFromLeague(@Query("l") strLeague: String): Call<TheSportsDBManager.GetAllTeamsObject>
}