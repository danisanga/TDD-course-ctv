package com.daniel.feature.vat.service.productPricingExercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductPricingServiceTest {

    private final ProductPricingService productPricingService = new ProductPricingService();

    @Test
    void calculateTotalPriceWithVAT_shouldCalculateTheCorrectPrice_whenCountryIsSpain() {
        double priceCalculated = productPricingService.calculateTotalPriceWithVAT(20.0, "ES");

        assertThat(priceCalculated).isEqualTo(24.2);
    }

    @Test
    void calculateTotalPriceWithVAT_shouldCalculateTheCorrectPrice_whenCountryIsAustralia() {
        double priceCalculated = productPricingService.calculateTotalPriceWithVAT(20.0, "AU");

        assertThat(priceCalculated).isEqualTo(22.0);
    }

    @Test
    void calculateTotalPriceWithVAT_shouldCalculateTheCorrectPrice_whenCountryIsCanada() {
        double priceCalculated = productPricingService.calculateTotalPriceWithVAT(20.0, "CA");

        assertThat(priceCalculated).isEqualTo(22.6);
    }

    @Test
    void calculateTotalPriceWithVAT_shouldThrowAnException_whenCountryIsNotPresentInData() {
        double priceCalculated = productPricingService.calculateTotalPriceWithVAT(200.0, "NU");

        assertThat(priceCalculated).isEqualTo(200.0);
    }

}
