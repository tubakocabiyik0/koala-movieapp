package org.example.koala.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import koala.composeapp.generated.resources.Inter_28pt_ExtraBold
import koala.composeapp.generated.resources.Res
import org.example.koala.model.populerOfWeekList
import org.jetbrains.compose.resources.Font


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun HorizontalGridLayout (header:String,populerOfWeekList: List<populerOfWeekList>){

    return Column(verticalArrangement = Arrangement.SpaceAround){
        Text(
            header,
            fontSize = 25.sp ,
            fontFamily = FontFamily(Font(Res.font.Inter_28pt_ExtraBold, FontWeight.ExtraBold)),
            modifier =  Modifier.padding(start = 16.dp) )
        HorizontalGrid(populerOfWeekList)
    }

}