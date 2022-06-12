package com.joel.list.listView

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.joel.list.model.MovieItem

@Composable
fun ListScreen(moviesList : List<MovieItem>){


   LazyColumn{
       itemsIndexed(items = moviesList){ _, movie ->

           MovieCardItem(movie = movie )
       }
   }
}