package org.example.koala


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Scaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.example.koala.composable.HorizontalGridLayout
import org.example.koala.model.PopulerMoviesOfWeek
import org.example.koala.model.PopulerOfWeek
import org.example.koala.model.PopulerTvs
import org.example.koala.viewModels.HomePageViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.example.koala.model.populerOfWeekList
import org.koin.compose.viewmodel.koinViewModel
import org.koin.compose.KoinContext


@Composable
@OptIn(ExperimentalMaterial3Api::class)
@Preview
fun MainApp() {
    val myViewModel = koinViewModel<HomePageViewModel>()
    var movieList by remember { mutableStateOf<PopulerOfWeek>(PopulerMoviesOfWeek("", listOf())) }
    var seriesList  by remember { mutableStateOf<PopulerOfWeek>(PopulerTvs("", listOf()))}

    LaunchedEffect(Unit){
        movieList = myViewModel.loadPopulerOfWeeks().populerMoviesOfTheWeek
        seriesList = myViewModel.loadPopulerOfWeeks().populerTvOfTheWeek
    }
    Scaffold() {
        Column {
            HorizontalGridLayout(movieList.title,movieList.data)
            Spacer(modifier = Modifier.height(5.dp))
            HorizontalGridLayout(seriesList.title,seriesList.data)
        }

    }
}