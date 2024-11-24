package com.esiea.tvshow.mostPopular.presentation.activity

import com.esiea.tvshow.showDetails.presentation.activity.DetailsActivity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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

                HomeScreen(viewModel){
                        mostPopular ->
                    var intent = Intent(this, DetailsActivity::class.java)
               intent.putExtra("showId", mostPopular.id)
                    startActivity( intent)
                }            }
        }
    }
}

