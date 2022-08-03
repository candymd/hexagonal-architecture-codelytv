package com.example.hexagonalarchitecturecodelytv.infrastructure

import com.example.hexagonalarchitecturecodelytv.domain.Video
import com.example.hexagonalarchitecturecodelytv.domain.VideoRepository
import org.springframework.stereotype.Repository

@Repository
class InMemoryVideoRepository : VideoRepository {

    override fun getAll(): List<Video> {
        val videos =  loadSampleVideos()
        return videos
    }

}

fun loadSampleVideos(): MutableList<Video> {
    return mutableListOf(
        Video("1", "Video 1", "Description 1"),
        Video("2", "Video 2", "Description 2"),
        Video("3", "Video 3", "Description 3")
    )
}