package com.joel.list.listView

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import com.joel.list.model.MovieItem

@Composable
fun ListScreen(carsList : List<MovieItem>){

   LazyColumn{
       itemsIndexed(items = carsList){ _, movie ->
           MovieCardItem(movie = movie )
       }
   }
}