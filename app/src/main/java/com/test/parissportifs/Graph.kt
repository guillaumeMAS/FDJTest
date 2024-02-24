package com.test.parissportifs

import android.content.Context
import com.test.parissportifs.ui.App

class Graph(
    private val app: App
) {

    fun provideContext() : Context = app.baseContext
}