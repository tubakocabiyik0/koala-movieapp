package org.example.koala.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import org.example.koala.model.populerOfWeekList


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun HorizontalGrid(populerOfWeek: List<populerOfWeekList>){

    LazyHorizontalGrid(
        rows = GridCells.Fixed(1), modifier = Modifier.height(210.dp).padding(start = 8.dp, end = 8.dp)
    ) {
        items(populerOfWeek.size) { index ->
            Column(
                verticalArrangement = Arrangement.spacedBy((-40).dp),
            ) {

                Box(modifier = Modifier.padding(8.dp).width(126.dp).clip(RoundedCornerShape(3.dp))){
                    AsyncImage  (
                        model = populerOfWeek[index].poster_path,
                        contentDescription = "film-list",
                        contentScale = ContentScale.Crop,
                    )
                }
               ScorBox(populerOfWeek[index].vote_average)
            }
        }
    }
}