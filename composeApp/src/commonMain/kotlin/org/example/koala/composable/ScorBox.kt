package org.example.koala.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.shadow

import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import koala.composeapp.generated.resources.Inter_28pt_ExtraBold
import koala.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.inset


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ScorBox(scor:String){
    val CIRCULAR_TIMER_RADIUS = 10
    Box(
        modifier = Modifier
            .width(40.dp)
            .height(100.dp)
            .shadow(8.dp, RoundedCornerShape(100))
            .background(Color.White),
        contentAlignment = Alignment.Center
    ){

    /*    Canvas(modifier = Modifier.size(100.dp)) {
            val sweepAngle = ((scor.toFloat()/10 )*360)
            val startAngle = 270f


            drawCircle(
                color = Color.Gray,
                style = Stroke(width = 7.dp.toPx(), cap = StrokeCap.Round)
            )
            drawArc(
                color = Color.Green,
                startAngle = startAngle,
                sweepAngle = sweepAngle,
                useCenter = false,
                style = Stroke(width =8.dp.toPx(), cap = StrokeCap.Round)
            )
        }*/
        Canvas(
            modifier = Modifier
                .size(100.dp)
                //.requiredHeight(CIRCULAR_TIMER_RADIUS.dp)
        ) {
            val sweepAngle = ((scor.toFloat()/10 )*360)
            val startAngle = 270f
            inset(3f) {
                // Arka plan çemberi
                drawCircle(
                    color = Color.Gray,
                    //radius = size.minDimension / 2 - 5f,  // Daha küçük bir çember
                    style = Stroke(width = 7f)
                )

                // İlerleme çemberi
                drawArc(
                    color = Color.Green,
                    startAngle = startAngle,
                    sweepAngle = sweepAngle,  // %75 doluluk
                    useCenter = false,
                    style = Stroke(width = 7f, cap = StrokeCap.Round)
                )
            }
        }
        Text(scor.toString(), textAlign = TextAlign.Center, fontFamily = FontFamily(Font(Res.font.Inter_28pt_ExtraBold, FontWeight.ExtraBold)))
    }
}