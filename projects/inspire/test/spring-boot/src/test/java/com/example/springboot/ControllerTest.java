package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ControllerTest {

    @Autowired
    protected MockMvc mvc;

    @Test
    void getSurvey() throws Exception {
        String content = mvc.perform(
                        get("/loyalty/brand/BWW/profiles/027c9cc6-5f51-4d51-ba4e-20a1ee7d6615/survey/038c9cc6-5f51-4d51-ba4e-20a1ee2d1111")
                )
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        assertThat(content).isEqualTo("/loyalty/brand/{brandId}/profiles/{lmsProfileId}/survey/{surveyId} called");
    }

    @Test
    void getSurveyDefault() throws Exception {
        String content = mvc.perform(
                        get("/loyalty/brand/BWW/profiles/027c9cc6-5f51-4d51-ba4e-20a1ee7d6615/survey/default")

                )
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        assertThat(content).isEqualTo("/loyalty/brand/{brandId}/profiles/{lmsProfileId}/survey/default called");
    }

    @Test
    void getSurveyShort() throws Exception {
        String content = mvc.perform(
                        get("/survey/038c9cc6-5f51-4d51-ba4e-20a1ee2d1111")
                )
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        assertThat(content).isEqualTo("/survey/{surveyId} called");
    }

    @Test
    void getSurveyShortDefault() throws Exception {
        String content = mvc.perform(
                        get("/survey/default")

                )
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        assertThat(content).isEqualTo("/survey/default called");
    }

}