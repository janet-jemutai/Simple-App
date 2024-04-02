package com.jemutai.simpleapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(
    private val postRepository: PostRepository
) : ViewModel() {
    val posts: MutableState<List<Post>> = mutableStateOf(emptyList())

    init {
        viewModelScope.launch {
            posts.value = postRepository.getPosts()
        }
    }
}
