package com.test.parissportifs.ui

import android.app.Application
import com.test.parissportifs.Graph

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        graph = Graph(this)
    }

    companion object {
        private lateinit var graph: Graph

        fun graph() : Graph {
            return graph
        }
    }
}