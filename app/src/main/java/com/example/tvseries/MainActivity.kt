package com.example.tvseries

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.affirmations.model.Serie
import com.example.tvseries.data.Datasource
import com.example.tvseries.ui.theme.TvSeriesTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TvSeriesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SeriesApp()
                }
            }
        }
    }
}

@Composable
fun SeriesApp() {
    SeriesList(
        serieList = Datasource().loadSeries(),
    )
}

@Composable
fun SeriesCard(serie: Serie, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(serie.imageResourceId),
                contentDescription = stringResource(serie.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(serie.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Composable
fun SeriesList(serieList: List<Serie>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(serieList) { serie ->
            SeriesCard(
                serie = serie,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}