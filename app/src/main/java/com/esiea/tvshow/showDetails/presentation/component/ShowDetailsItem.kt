//package com.esiea.tvshow.showDetails.presentation.component
//
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxHeight
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardDefaults
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import coil3.compose.AsyncImage
//import com.esiea.tvshow.showDetails.domain.model.ShowDetails
//
//@Composable
//fun ShowDetailsItem(
//    modifier: Modifier = Modifier,
//    showDetails: ShowDetails
//) {
//    Card(
//        colors = CardDefaults.cardColors(
//            containerColor = Color.White
//        ),
//        modifier = Modifier.padding(16.dp),
//    ) {
//        Column(
//            horizontalAlignment = Alignment.Start,
//            verticalArrangement = Arrangement.spacedBy(10.dp),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp)
//        ) {
//
//            AsyncImage(
//                model = showDetails.image_path,
//                contentDescription = null,
//                contentScale = ContentScale.FillWidth,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(200.dp)
//            )
//
//
//            Text(
//                text = showDetails.name,
//                fontWeight = FontWeight.Bold,
//                maxLines = 2,
//                fontSize = 24.sp,
//                textAlign = TextAlign.Start
//            )
//
//
//            Row(
//                horizontalArrangement = Arrangement.SpaceBetween,
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Text(
//                    text = "Country: ${showDetails.country}",
//                    fontSize = 16.sp,
//                    textAlign = TextAlign.Start
//                )
//                Text(
//                    text = "Status: ${showDetails.status}",
//                    fontSize = 16.sp,
//                    textAlign = TextAlign.Start
//                )
//            }
//
//
//            Row(
//                horizontalArrangement = Arrangement.SpaceBetween,
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Text(
//                    text = "Start: ${showDetails.start_date}",
//                    fontSize = 16.sp,
//                    textAlign = TextAlign.Start
//                )
////                Text(
////                    text = "End: ${showDetails.end_date ?: "Ongoing"}",
////                    fontSize = 16.sp,
////                    textAlign = TextAlign.Start
////                )
//            }
//
//
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween,
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Text(
//                    text = "Rating: ${showDetails.rating}",
//                    fontSize = 16.sp,
//                    textAlign = TextAlign.Start,
//                    fontWeight = FontWeight.Bold
//                )
//                Text(
//                    text = "Votes: ${showDetails.rating_count}",
//                    fontSize = 16.sp,
//                    textAlign = TextAlign.Start
//                )
//            }
//
//            Text(
//                text = "Description: ${showDetails.description}",
//                maxLines = 5,
//                fontSize = 14.sp,
//                textAlign = TextAlign.Start
//            )
//        }
//    }
//}
