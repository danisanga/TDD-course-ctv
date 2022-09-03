package com.daniel.feature.vat.utils.productPricingExercise;

import com.daniel.feature.vat.util.productPricingExercise.CountryVATUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountryVATUtilsTest {

    private final CountryVATUtils countryVATUtils = new CountryVATUtils();

    @Test
    void getVATValueByCountry_shouldReturned() {
        final Integer vatAmount = countryVATUtils.getVATValueByCountry("ES");

        assertThat(vatAmount).isEqualTo(21);
    }

    @Test
    void getVATValueByCountry_shouldReturnZero_whenNoCountryIsSpecified() {
        Integer vatAmount = countryVATUtils.getVATValueByCountry("");

        assertThat(vatAmount).isZero();
    }

    @Test
    void getVATValueByCountry_shouldReturnZero_whenNotIncludedCountry() {
        Integer vatAmount = countryVATUtils.getVATValueByCountry("NU");

        assertThat(vatAmount).isZero();
    }

}
