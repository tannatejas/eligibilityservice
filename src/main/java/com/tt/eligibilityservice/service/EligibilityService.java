package com.tt.eligibilityservice.service;

import com.tt.eligibilityservice.dto.EligibilityResponse;

import java.util.List;

public interface EligibilityService {

    public List<EligibilityResponse> getEligibilities(final List<String> accountId, final List<String> assetId);
}
