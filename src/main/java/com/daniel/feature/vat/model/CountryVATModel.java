package com.daniel.feature.vat.model;

import java.util.Map;

/**
 * Model class for relation between country and VAT amount.
 */
public class CountryVATModel {

    public CountryVATModel() {
        // Empty constructor.
    }

    public Map<String, Integer> getCountryVAT() {
        return Map.of(
            "ES", 21,
            "AU", 10,
            "CA", 13
            // Add more values...
        );
    }

}
