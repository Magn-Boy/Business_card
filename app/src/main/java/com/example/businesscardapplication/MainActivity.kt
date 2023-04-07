package com.example.businesscardapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapplication.ui.theme.BusinessCardApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.onBackground
                ) {
                    BusinessCardApplication()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApplication() {
    BusinessCard(
        title = stringResource(R.string.title),
        description = stringResource(R.string.content),
        imagePainter = painterResource(R.drawable.android_logo)
    )
}


@Composable
fun BusinessCard(
    title: String,
    description: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
            Column(
                modifier = modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = imagePainter,
                    contentDescription = null,
                    modifier = Modifier.size(90.dp)
                )
                Text(
                    text = title,
                    fontSize = 32.sp,
                    color = Color.White,
                    modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
                )
                Text(
                    text = description,
                    color = Color.Green
                )
            }
        }
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomStart
    ) {
        Column(
        ) {
            Row(modifier = modifier.padding(start = 65.dp)) {
                Icon(
                    Icons.Filled.Menu,
                    contentDescription = null,
                    tint = Color.White
                )
                Text(
                    text = "+11 (123) 444 555 666",
                    textAlign = TextAlign.Justify,
                    color = Color.White,
                    modifier = Modifier.padding(8.dp)
                )
            }
            Row(modifier = modifier.padding(start = 65.dp)) {
                Icon(
                    Icons.Filled.Menu,
                    contentDescription = null,
                    tint = Color.White
                )
                Text(
                    text = "+11 (123) 444 555 666",
                    textAlign = TextAlign.Justify,
                    color = Color.White,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
            }
            Row(modifier = modifier.padding(start = 65.dp)) {
                Icon(
                    Icons.Filled.Menu,
                    contentDescription = null,
                    tint = Color.White
                )
                Text(
                    text = "+11 (123) 444 555 666",
                    color = Color.White,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                        .padding(8.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardApplicationTheme {
        BusinessCardApplication()
    }
}