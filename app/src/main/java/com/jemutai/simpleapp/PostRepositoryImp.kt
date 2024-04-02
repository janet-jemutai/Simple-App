package com.jemutai.simpleapp

class PostRepositoryImpl(private val apiService: ApiService) : PostRepository {
    override suspend fun getPosts(): List<Post> {
        return apiService.getPosts()
    }
}
