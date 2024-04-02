package com.tt.eligibilityservice.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EligibilityResponse {

    private boolean eligible;
    private List<String> assetId;
    private List<String> accountId;
    private double discount;

    @Override
    public String toString() {
        return "EligibilityResponse{" +
                "eligible=" + eligible +
                ", assetIds=" + assetId +
                ", accountIds=" + accountId +
                ", discount=" + discount +
                '}';
    }
}
