package com.esiea.tvshow.mostPopular.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.esiea.tvshow.R
import com.esiea.tvshow.mostPopular.domain.model.MostPopular
import com.esiea.tvshow.mostPopular.presentation.component.FilmItem
import com.esiea.tvshow.mostPopular.presentation.viewModel.MostPopularViewModel
import com.esiea.tvshow.ui.theme.yellow
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun HomeScreen(
    mostPopularViewModel: MostPopularViewModel = hiltViewModel(),
    modifier: Modifier = Modifier,
    onclickOnMostPopularScreen : (MostPopular) -> Unit
) {
    val stateResult = mostPopularViewModel.mostPopularState.value

    Column(

        modifier = Modifier.fillMaxSize().padding(20.dp)
    ) {
        // Header Home
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()

        ){
            Column (
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ){

                Text(
                    text = "Hi, Angelina \uD83D\uDC4B",
                    fontSize = 13.sp
                )

                Text(
                    text = "Welcome back",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Icon(
                painter = painterResource(R.drawable.outline_notifications_24),
                contentDescription = "Icon",
                modifier = Modifier.size(30.dp)
            )

        }
        Spacer(modifier = Modifier.height(16.dp))

        // From Search

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .background(Color.Gray, shape = RoundedCornerShape(8.dp))
                .padding(horizontal = 16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Search",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(50.dp))


        // List Movie

        Row(horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()) {

            Text(
                text = "Most Popular",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Row(horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Voir Tout",
                    fontSize = 12.sp,
                    color = yellow
                )
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_keyboard_double_arrow_right_24),
                        contentDescription = "Icon",
                        tint = yellow,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }


        }
        LazyColumn(
            modifier = modifier.fillMaxSize(),
            contentPadding = PaddingValues(10.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(
                space = 10.dp,
                alignment = Alignment.CenterVertically
            )
        ) {
            items(stateResult.mostPopular){

                    mostPopular : MostPopular ->
                FilmItem( mostPopular = mostPopular){
                        mostPopular -> onclickOnMostPopularScreen(mostPopular)
                }

            }
        }
    }
}