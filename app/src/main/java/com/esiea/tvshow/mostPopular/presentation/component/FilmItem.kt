package com.esiea.tvshow.mostPopular.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.esiea.tvshow.mostPopular.domain.model.MostPopular

@Composable
 fun FilmItem(modifier: Modifier = Modifier,
              mostPopular: MostPopular,
              onclickOnMostPopular : (MostPopular) -> Unit
) {
       Card(
           colors = CardDefaults.cardColors(
               containerColor = Color.White
           ),
           onClick = {
               onclickOnMostPopular(mostPopular)
           },

       ) {
         Row(
             horizontalArrangement = Arrangement.SpaceAround,
              modifier = Modifier.fillMaxSize()
         ) {
             AsyncImage(
                 model = mostPopular.imageThumbnailPath,
                 contentDescription = null,
                 contentScale = ContentScale.FillHeight,
                 modifier = Modifier
                     .height(300.dp)
                     .fillMaxWidth(0.5f)
             )
             Column (
                 horizontalAlignment = Alignment.CenterHorizontally,
                 verticalArrangement = Arrangement.spacedBy(10.dp),
                 modifier = Modifier.fillMaxSize().padding(10.dp)

             ){
                 Text(
                     text = mostPopular.name,
                     fontWeight = FontWeight.Bold,
                     maxLines = 2,
                     fontSize = 20.sp,
                     textAlign = TextAlign.Center,
                 )
                 Text(
                     text = "pays : ${mostPopular.country}",
                     maxLines = 1,
                     fontSize = 16.sp,
                     textAlign = TextAlign.Center,
                 )
                 Text(
                     text = "Sortie : ${mostPopular.startDate}",
                     maxLines = 1,
                     fontSize = 16.sp,
                     textAlign = TextAlign.Center,
                 )
                 Text(
                     text = "Fin : ${mostPopular.endDate}",
                     maxLines = 1,
                     fontSize = 16.sp,
                     textAlign = TextAlign.Center,
                 )

                 Text(
                     text = "Status : ${mostPopular.status}",
                     maxLines = 1,
                     fontSize = 16.sp,
                     textAlign = TextAlign.Center,
                 )
             }

         }
       }
}