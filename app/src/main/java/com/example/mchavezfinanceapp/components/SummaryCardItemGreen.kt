package com.example.finanzasapp.components

import androidx.annotation.ColorRes
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun SummaryCardItemGreen(
    title: String,
    amount: String,
    color: Color,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null
) {

    Card(
        modifier = modifier,
        shape = RoundedCornerShape(20.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color),
            contentAlignment = Alignment.Center
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                if (icon != null) {
                    Icon(
                        imageVector = icon,
                        tint = Color.Black,
                        contentDescription = null
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                }

                Text(
                    text = title,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                if (amount.isNotEmpty()) {

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = amount,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}