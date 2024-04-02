package com.jemutai.simpleapp

// Extensions.kt
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State

fun <T> MutableState<T>.collectAsState(): T {
    return this.value
}
