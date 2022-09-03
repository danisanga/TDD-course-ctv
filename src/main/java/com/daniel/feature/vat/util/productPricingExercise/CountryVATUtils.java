package com.daniel.feature.vat.util.productPricingExercise;

import com.daniel.feature.vat.model.CountryVATModel;

import java.util.Optional;

public class CountryVATUtils {

    private static final int DEFAULT_VAT_VALUE = 0;

    private final CountryVATModel countryVATModel = new CountryVATModel();

    public CountryVATUtils() {
        // Empty constructor.
    }

    /**
     * Get VAT amount by country ISO.
     *
     * @param countryISO    the country ISO
     * @return the VAT amount
     */
    public int getVATValueByCountry(final String countryISO) {

            return Optional.ofNullable(countryVATModel.getCountryVAT())
                .stream()
                .map(vatValues -> vatValues.getOrDefault(countryISO, DEFAULT_VAT_VALUE))
                .findAny()
                .orElse(DEFAULT_VAT_VALUE);
    }
}
