package com.tt.eligibilityservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    private String assetId;
    private int quantity;

    @Override
    public String toString() {
        return "Position{" +
                "assetId='" + assetId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
