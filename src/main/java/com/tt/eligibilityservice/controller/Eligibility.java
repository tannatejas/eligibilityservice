package com.tt.eligibilityservice.controller;

import com.tt.eligibilityservice.dto.EligibilityRequest;
import com.tt.eligibilityservice.dto.EligibilityResponse;
import com.tt.eligibilityservice.service.EligibilityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${base-service.path}")
public class Eligibility {

    @Autowired
    private EligibilityServiceImpl eligibilityService;

    @PostMapping("/v1.0/eligibility")
    public List<EligibilityResponse> getEligibilities(@RequestBody EligibilityRequest request) {
        return eligibilityService.getEligibilities(request.getAccountId(), request.getAssetId());
    }
}