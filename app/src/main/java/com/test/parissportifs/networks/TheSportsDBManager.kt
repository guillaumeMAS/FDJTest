package com.test.parissportifs.networks

import com.test.parissportifs.models.League
import com.test.parissportifs.models.Team
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TheSportsDBManager(
    private val service: TheSportsDBService
) {

    fun getAllLeagues() {
        service.getAllLeagues().enqueue(object : Callback<GetAllLeaguesObject> {
            override fun onResponse(
                call: Call<GetAllLeaguesObject>,
                response: Response<GetAllLeaguesObject>
            ) {
                val leagues = response.body()!!.leagues
            }

            override fun onFailure(call: Call<GetAllLeaguesObject>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

    fun getAllTeamsFromLeague(strLeague: String) {
        service.getAllTeamsFromLeague(strLeague).enqueue(object : Callback<GetAllTeamsObject> {
            override fun onResponse(
                call: Call<GetAllTeamsObject>,
                response: Response<GetAllTeamsObject>
            ) {
                val teams = response.body()!!.teams
            }

            override fun onFailure(call: Call<GetAllTeamsObject>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

    class GetAllLeaguesObject(
        val leagues: List<League>
    )

    class GetAllTeamsObject(
        val teams: List<Team>
    )
}