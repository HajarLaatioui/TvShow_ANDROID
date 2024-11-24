package com.esiea.tvshow.showDetails.presentation.activity

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModelProvider
import com.esiea.tvshow.mostPopular.presentation.viewModel.MostPopularViewModel
import com.esiea.tvshow.showDetails.presentation.screens.ShowDetailsScreen
import com.esiea.tvshow.showDetails.presentation.viewmodel.ShowDetailsViewModel
import com.esiea.tvshow.ui.theme.TvShowTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val showId = intent.getIntExtra("showId", 0)
        setContent {
            TvShowTheme {
//                val viewModel: ShowDetailsViewModel = hiltViewModel()
               val  viewModel  = ViewModelProvider(this)[ShowDetailsViewModel::class]


                ShowDetailsScreen(showId = showId, viewModel)
            }
        }
    }
}

