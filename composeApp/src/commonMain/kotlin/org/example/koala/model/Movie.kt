package org.example.koala.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Movie(
    val populerMoviesOfTheWeek : PopulerMoviesOfWeek,
    val populerTvOfTheWeek : PopulerTvs
)
