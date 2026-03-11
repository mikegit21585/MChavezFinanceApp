package com.example.mchavezfinanceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mchavezfinanceapp.ui.theme.MChavezFinanceAppTheme
import com.example.mchavezfinanceapp.models.user

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MChavezFinanceAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        item {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Box(
                        modifier = Modifier
                            .size(60.dp)
                            .background(Color(0xFFE7D7C9), shape = CircleShape),
                        contentAlignment = Alignment.Center
                    ) {

                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .background(Color.Black, shape = CircleShape),
                            contentAlignment = Alignment.Center
                        ) {

                            Icon(
                                imageVector = Icons.Default.Person,
                                tint = Color(0xFFE7D7C9),
                                contentDescription = "Usuario"
                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    Column {

                        Text("Hola ${user.name}", fontWeight = FontWeight.Bold)

                        Text("Bienvenido")
                    }
                }

                IconButton(onClick = {}) {

                    Icon(Icons.Default.Menu, contentDescription = "")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MChavezFinanceAppTheme {
        HomeScreen()
    }
}