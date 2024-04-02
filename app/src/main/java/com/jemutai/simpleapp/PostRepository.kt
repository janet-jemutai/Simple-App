package com.jemutai.simpleapp

interface PostRepository {
    suspend fun getPosts(): List<Post>
}
