package com.esiea.tvshow.mostPopular.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.esiea.tvshow.mostPopular.presentation.screens.HomeScreen
import com.esiea.tvshow.mostPopular.presentation.viewModel.MostPopularViewModel
import com.esiea.tvshow.ui.theme.TvShowTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            TvShowTheme {
                val viewModel: MostPopularViewModel = hiltViewModel()

                HomeScreen(viewModel)
            }
        }
    }
}
