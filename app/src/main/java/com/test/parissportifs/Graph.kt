package com.test.parissportifs

import android.content.Context
import com.test.parissportifs.networks.TheSportsDBManager
import com.test.parissportifs.networks.TheSportsDBModule
import com.test.parissportifs.ui.App

class Graph(
    private val app: App
) {

    /* TheSportsDB */
    private val theSportsDBModule = TheSportsDBModule()
    private val theSportsDBService by lazy { theSportsDBModule.createTheSportsDBManager() }
    private val theSportsDBManager by lazy { TheSportsDBManager(theSportsDBService) }

    fun provideContext() : Context = app.baseContext
    fun provideTheSportsDBManager() = theSportsDBManager
}