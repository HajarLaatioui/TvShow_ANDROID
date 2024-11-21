import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.esiea.tvshow.showDetails.presentation.screens.ShowDetailsScreen
import com.esiea.tvshow.showDetails.presentation.viewmodel.ShowDetailsViewModel
import com.esiea.tvshow.ui.theme.TvShowTheme
import dagger.hilt.android.AndroidEntryPoint


class DetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val showId = intent.getIntExtra("showId", -1)
//        Log.d("IDSHOW", "idShow : ${showId} " )
//
        setContent {
            TvShowTheme {
                ShowDetailsScreen()
            }
        }
    }
}

