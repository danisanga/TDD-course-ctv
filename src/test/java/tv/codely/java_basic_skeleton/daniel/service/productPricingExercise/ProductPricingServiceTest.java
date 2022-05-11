package tv.codely.java_basic_skeleton.daniel.service.productPricingExercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductPricingServiceTest {

    private final ProductPricingService productPricingService = new ProductPricingService();

    @Test
    void calculatePriceWithVAT_shouldCalculateTheCorrectPrice_whenCountryIsSpain() {
        double priceCalculated = productPricingService.calculateTotalPriceWithVAT(20.0, "ES");

        assertThat(priceCalculated).isEqualTo(24.2);
    }

    @Test
    void calculatePriceWithVAT_shouldCalculateTheCorrectPrice_whenCountryIsAustralia() {
        double priceCalculated = productPricingService.calculateTotalPriceWithVAT(20.0, "AU");

        assertThat(priceCalculated).isEqualTo(22.0);
    }

}
