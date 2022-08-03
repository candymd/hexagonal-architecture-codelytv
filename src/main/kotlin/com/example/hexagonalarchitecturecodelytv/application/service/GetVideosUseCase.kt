package com.example.hexagonalarchitecturecodelytv.application.service

import com.example.hexagonalarchitecturecodelytv.domain.VideoRepository
import org.springframework.stereotype.Service

@Service
class GetVideosUseCase(
    private val videoRepository: VideoRepository
    ) {

    fun execute() = videoRepository.getAll()
}

