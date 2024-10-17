package org.example.koala.service

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.example.koala.model.Movie
import org.example.koala.utils.baseUrl

interface ApiService {
    suspend fun fetchPopulerOfWeeks(): Movie
}

fun createHttpClient(): HttpClient {
    return HttpClient {
        install(Logging) {
            level = LogLevel.ALL
        }
        install(ContentNegotiation){
            json(json = Json { ignoreUnknownKeys = true })
        }
    }
}

class ApiServiceImpl(private val client: HttpClient) : ApiService {
    override suspend fun fetchPopulerOfWeeks(): Movie {
        return client.get("$baseUrl"+"explore").body()
    }
}

