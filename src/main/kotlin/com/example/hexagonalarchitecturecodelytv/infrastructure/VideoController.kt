package com.example.hexagonalarchitecturecodelytv.infrastructure

import com.example.hexagonalarchitecturecodelytv.application.service.GetVideosUseCase
import com.example.hexagonalarchitecturecodelytv.domain.Video
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VideoController(
   private val getVideosUseCase: GetVideosUseCase
) {

    @GetMapping("/videos")
    fun getVideos(): List<Video> {
        return getVideosUseCase.execute()
    }

}