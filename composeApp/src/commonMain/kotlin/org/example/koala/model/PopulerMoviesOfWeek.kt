package org.example.koala.model

import kotlinx.serialization.Serializable

@Serializable
data class PopulerMoviesOfWeek (
    override val title: String,
    override val data: List<populerOfWeekList>

):PopulerOfWeek