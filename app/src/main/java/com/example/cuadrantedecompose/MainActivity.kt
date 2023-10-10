package com.example.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //
                }
            }
        }
    }
}

@Composable
fun CuadrnateAPP(){
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            InsertarContenido(titulo = stringResource(
                R.string.titulo1_text),
                contenido = stringResource(R.string.contenido1_text),
                colorFondo = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            InsertarContenido(titulo = stringResource(
                R.string.titulo2_text),
                contenido = stringResource(R.string.contenido2_text),
                colorFondo = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }

        Row(Modifier.weight(1f)) {
            InsertarContenido(
                titulo = stringResource(R.string.titulo3_text),
                contenido = stringResource(R.string.contenido3_text),
                colorFondo = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            InsertarContenido(
                titulo = stringResource(R.string.titulo4_text),
                contenido = stringResource(R.string.contenido4_text),
                colorFondo = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }

    }
}


//Funcion que se encarga de dar estilo a cada tarjeta(Cuadrante)
@Composable
fun InsertarContenido(
    titulo : String,
    contenido : String,
    colorFondo : Color,
    modifier: Modifier = Modifier
){
    //
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorFondo)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )   {
        //
        Text(
            text = titulo,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = contenido,
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
    )
@Composable
fun GreetingPreview() {
    CuadranteDeComposeTheme {
        CuadrnateAPP()
    }
}