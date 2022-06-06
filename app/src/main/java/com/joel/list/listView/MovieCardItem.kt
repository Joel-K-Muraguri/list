package com.joel.list.listView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.joel.list.model.Movie
import com.joel.list.model.MovieItem

@Composable
fun MovieCardItem(
    movie: MovieItem
){
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = 10.dp

    ) {
        Surface() {
           Row() {
              val painter = rememberAsyncImagePainter(model = movie.imageUrl)

               Image(
                   painter = painter,
                   contentDescription = movie.name,
                   modifier = Modifier
                       .clip(CircleShape)
               )

           }
            Column() {
                Text(
                    text = movie.name,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp,
                    color = Color.Black

                )
                Text(
                    text = movie.category,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .background(Color.Cyan)

                )

                Text(
                    text = movie.desc,
                    maxLines = 3
                )
            }
        }
    }
}
