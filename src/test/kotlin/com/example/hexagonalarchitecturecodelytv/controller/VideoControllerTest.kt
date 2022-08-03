package com.example.hexagonalarchitecturecodelytv.controller

import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import org.springframework.test.web.servlet.MockMvc


@SpringBootTest
@AutoConfigureMockMvc
class VideoControllerTest {

    @Autowired
    private val mvc: MockMvc? = null

    @BeforeEach
    fun setUp() {
        RestAssuredMockMvc.mockMvc(mvc)
    }

    companion object{
        const val EXPECTED_VIDEO_TITLE = "Video 1"
        const val EXPECTED_VIDEO_ID = "1"
    }

    @Test
    internal fun `should return all existing videos`() {
        RestAssuredMockMvc.given()
            .`when`()
            .get("/videos")
            .then()
            .statusCode(HttpStatus.OK.value())
            .body("id[0]", equalTo(EXPECTED_VIDEO_ID))
            .body("title[0]", equalTo(EXPECTED_VIDEO_TITLE))
    }
}