package com.jemutai.simpleapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun PostList(posts: List<Post>) {
    LazyColumn {
        items(posts) { post ->
            Text(text = post.title)
        }
    }
}
