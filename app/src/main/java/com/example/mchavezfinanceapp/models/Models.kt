package com.example.mchavezfinanceapp.models

import androidx.compose.ui.graphics.Color

data class User(
    val name: String,
    val balance: Double
)

data class SummaryCard(
    val title: String,
    val amount: String,
    val color: Color
)

data class Transaction(
    val store: String,
    val category: String,
    val amount: Double,
    val time: String
)