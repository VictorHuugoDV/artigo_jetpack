package com.example.artigo_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artigo_jetpack.ui.theme.Artigo_JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Artigo_JetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Dados()
                }
            }
        }
    }
}

@Composable
fun Dados(){
    Artigo(
    titulo= stringResource(id = R.string.titulo_jetpack),
    descricao_curta= stringResource(id = R.string.descricao_curta),
    descricao_longa= stringResource(id = R.string.descricao_longa),
    imagem= painterResource(id = R.drawable.bg_compose_background)
    )
}

@Composable
private fun Artigo(
    titulo:String,
    descricao_curta:String,
    descricao_longa:String,
    imagem:Painter
){
    Column(modifier = Modifier) {
        Image(painter = imagem, contentDescription = null)
        Text(
            text =titulo,
            Modifier
                .padding(16.dp),
            fontSize = 24.sp,
        )
        Text(
            text = descricao_curta,
            Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = descricao_longa,
            Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Artigo_JetpackTheme {
        Dados()
    }
}