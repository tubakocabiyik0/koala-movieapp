package org.example.koala.model

import kotlinx.serialization.Serializable


interface PopulerOfWeek {
    val title:String
    val data : List<populerOfWeekList>
}

@Serializable
data class populerOfWeekList(
     val id : Int,
     val poster_path: String,
     val backdrop_path:String,
     val vote_average : String,
     val primary_hex :  String,
     val secondary_hex : String
)