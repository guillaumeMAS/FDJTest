package com.test.parissportifs.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.test.parissportifs.ui.App
import com.test.parissportifs.ui.theme.ParisSportifsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ParisSportifsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TestTheSportDB()
                }
            }
        }
    }
}

@Composable
fun TestTheSportDB() {

    val theSportsDBManager = App.graph().provideTheSportsDBManager()
    Row {
        TextButton(
            onClick = {
                theSportsDBManager.getAllLeagues()
            }) {
            Text(text = "Get Leagues")
        }

        TextButton(
            onClick = {
                theSportsDBManager.getAllTeamsFromLeague("French Ligue 1")
            }) {
            Text(text = "Get Teams from French League 1")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TestTheSportDBPreview() {
    ParisSportifsTheme {
        TestTheSportDB()
    }
}