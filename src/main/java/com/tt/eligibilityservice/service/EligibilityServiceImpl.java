package com.tt.eligibilityservice.service;

import com.tt.eligibilityservice.dto.EligibilityResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EligibilityServiceImpl implements EligibilityService{

    @Override
    public List<EligibilityResponse> getEligibilities(final List<String> accountId, final List<String> assetId) {
        // Temp data for demo
        List<EligibilityResponse> responses = new ArrayList<>();
        responses.add(new EligibilityResponse(true, List.of("S1", "S2", "S3"), List.of("E1", "E2"), 0.9));
        responses.add(new EligibilityResponse(false, List.of("S4", "S5"), List.of("E1", "E2"), 0));
        return responses;
    }
}