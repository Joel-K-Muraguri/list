package com.joel.list.listView

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.joel.list.model.MovieItem


@Composable
fun MovieCardItem(
    movie: MovieItem
){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .size(80.dp),
        elevation = 5.dp
    ) {
        MovieCard(movie = movie)
    }
}
@Composable
fun MovieCard(
    movie: MovieItem
) {
    Row(
        modifier = Modifier
            .height(50.dp)
            .size(150.dp)
            ,

    ) {
        MoviePictureComposable(movie)
        MovieContentComposable(movie)
    }
}

@Composable
fun MoviePictureComposable(
    movie: MovieItem
){
    Card(
        modifier = Modifier
            .size(80.dp),

    ) {
         AsyncImage(
                       model = ImageRequest.Builder(LocalContext.current)
                           .data(movie.imageUrl)
                           .crossfade(true)
                           .build(),
                       contentDescription = movie.name,
                       modifier = Modifier
                           .clip(CircleShape),
                       contentScale = ContentScale.Crop
                   )
    }
}

@Composable
fun MovieContentComposable(
    movie: MovieItem
){
    Column(
       modifier = Modifier
           .fillMaxSize()

    ) {
        Text(
            text = movie.name,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 50.sp
        )
        Text(
            text = movie.category,
            modifier = Modifier
                .background(Color.Cyan),
            fontSize = 20.sp

        )
        Text(
            text = movie.desc,
            fontSize = 10.sp,
            fontWeight = FontWeight.ExtraLight,
            overflow = TextOverflow.Ellipsis,
            maxLines = 5
        )
    }

}


                  /* AsyncImage(
                       model = ImageRequest.Builder(LocalContext.current)
                           .data(movie.imageUrl)
                           .crossfade(true)
                           .build(),
                       contentDescription = movie.name,
                       modifier = Modifier
                           .clip(CircleShape),
                       contentScale = ContentScale.Crop
                   ) */


