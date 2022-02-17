package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Controller {

    @GetMapping("/loyalty/brand/{brandId}/profiles/{lmsProfileId}/survey/{surveyId}")
    public String getSurvey(@PathVariable String brandId, @PathVariable UUID lmsProfileId, @PathVariable String surveyId) {
        return "/loyalty/brand/{brandId}/profiles/{lmsProfileId}/survey/{surveyId} called";
    }

    @GetMapping("/loyalty/brand/{brandId}/profiles/{lmsProfileId}/survey/default")
    public String getDefaultSurvey(@PathVariable String brandId, @PathVariable UUID lmsProfileId) {
        return "/loyalty/brand/{brandId}/profiles/{lmsProfileId}/survey/default called";
    }

    @GetMapping("/survey/{surveyId}")
    public String getSurveyShort(@PathVariable String surveyId) {
        return "/survey/{surveyId} called";
    }

    @GetMapping("/survey/default")
    public String getDefaultSurveyShort() {
        return "/survey/default called";
    }

}
