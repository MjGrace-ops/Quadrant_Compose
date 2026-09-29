 package com.example.quadrant_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant_compose.ui.theme.Quadrant_ComposeTheme

 class MainActivity : ComponentActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

         setContent {
             Quadrant_ComposeTheme {
                 ComposeQuadrant()
             }         }
     }
 }
 @Composable
 fun ComposeQuadrant() {

     Column(
         modifier = Modifier.fillMaxSize()
     ) {
         Row(
             modifier = Modifier.weight(1f)
         ) {

             Quadrant(
                 titre = stringResource(R.string.Titre1),
                 description = stringResource(R.string.Description1),
                 backgroundColor = Color(0xFFEADDFF),
                 modifier = Modifier.weight(1f),
             )

             Quadrant(
                     titre = stringResource(R.string.Titre2),
                     description = stringResource(R.string.Description2),
                     backgroundColor = Color(0xFFD0BCFF),
                     modifier = Modifier.weight(1f)

             )
         }

         Row(
             modifier = Modifier.weight(1f)
         ) {
             Quadrant(
                 titre = stringResource(R.string.Titre3),
                 description = stringResource(R.string.Description3),
                 backgroundColor = Color(0xFFB69DF8),
                 modifier = Modifier.weight(1f),
             )

             Quadrant(
                 titre = stringResource(R.string.Titre4),
                 description = stringResource(R.string.Description4),
                 backgroundColor = Color(0xFFF6EDFF),
                 modifier = Modifier.weight(1f)
             )
         }

     }
 }
 @Composable
 fun Quadrant(
     titre: String,
     description: String,
     backgroundColor: Color,
     modifier: Modifier = Modifier
 ) {

     Column(
         modifier = modifier
             .fillMaxSize()
             .background(backgroundColor)
             .padding(16.dp),

         verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally
     ) {

         Text(
             text = titre,
             fontWeight = FontWeight.Bold,
             modifier = Modifier.padding(bottom = 16.dp)
         )

         Text(
             text = description,
             textAlign = TextAlign.Justify
         )
     }
 }
@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    Quadrant_ComposeTheme {
        ComposeQuadrant()
    }
}