package com.esiea.tvshow.showDetails.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import coil3.compose.AsyncImage
@Composable
fun ShowDetailsScreen(modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState(pageCount = {
        3
    })
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            // Image
            AsyncImage(
                contentScale = ContentScale.FillWidth,
                model = "https://static.episodate.com/images/tv-show/thumbnail/23455.jpg",
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
            )
        }

        item {
            // Card for details
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .offset(y = -50.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Black)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Avengers: Infinity War",
                        style = MaterialTheme.typography.titleMedium,
                        color = Color.White,
                        fontSize = 25.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "2h29m • 16.12.2022",
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.Gray,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Review",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.White,
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "4.8",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.White,
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "(1,222)",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Gray,
                            fontSize = 16.sp
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = { /* Handle Watch Trailer */ },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                    ) {
                        Text(text = "Watch trailer", color = Color.White)
                    }
                }
            }
        }

        item {
            // Additional content
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        "Movie genre:",
                        fontSize = 20.sp
                    )
                    Text(
                        "Action, Adventure, Sci-Fi",
                        fontWeight = FontWeight.Bold,
                        fontSize = 17.sp
                    )
                }
                Text(
                    "Description",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                Text(
                    "Nine noble families fight for control of the mythical land of Westeros. Political and sexual intrigue is pervasive. Robert Baratheon, King of Westeros, Nine noble families fight for control of the mythical land of Westeros. Political and sexual intrigue is pervasive. Robert Baratheon, King of Westeros,asks his old friend Eddard, Lord Stark, to serve as Hand of the King, or highest official. Secretly warned that the previous Hand was assassinated, Eddard accepts in order to investigate further. Meanwhile, the Queen's family, the Lannisters, may be hatching a plot to take power. Across the sea, the last members of the previous and deposed ruling family, the Targaryens, are also scheming to regain the throne.",
                    fontSize = 16.sp,
                    maxLines = 5
                )
                Text(
                    "Pictures",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                HorizontalPager(state = pagerState) { page ->
                    // Our page content
                    AsyncImage(
                        contentScale = ContentScale.FillWidth,
                        model = "https://static.episodate.com/images/tv-show/thumbnail/23455.jpg",
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                    )
                }
                Spacer(  modifier = Modifier.height(20.dp))

            }
        }


    }
}
