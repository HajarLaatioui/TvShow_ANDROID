package com.esiea.tvshow.mostPopular.presentation.activity

import android.content.Intent
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
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.lifecycleScope
import com.esiea.tvshow.mostPopular.presentation.screens.HomeScreen
import com.esiea.tvshow.mostPopular.presentation.viewModel.MostPopularViewModel
import com.esiea.tvshow.showDetails.presentation.activity.ShowDetailsActivity
import com.esiea.tvshow.ui.theme.TvShowTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashscreen = installSplashScreen()
        var keepSplashScreen = true
        super.onCreate(savedInstanceState)
        splashscreen.setKeepOnScreenCondition { keepSplashScreen }
        lifecycleScope.launch {
            delay(5000)
            keepSplashScreen = false
        }//        enableEdgeToEdge()
        setContent {
            TvShowTheme {
                val viewModel: MostPopularViewModel = hiltViewModel()

                HomeScreen(viewModel){
                        mostPopular ->
                    var intent = Intent(this, ShowDetailsActivity::class.java)
//                intent.putExtra("film", mostPopular)
                    startActivity( intent)
                }
            }
        }
    }
}

