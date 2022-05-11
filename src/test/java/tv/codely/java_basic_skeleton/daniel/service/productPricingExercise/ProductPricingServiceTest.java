package tv.codely.java_basic_skeleton.daniel.service.productPricingExercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductPricingServiceTest {

    private final ProductPricingService productPricingService = new ProductPricingService();

    @Test
    void calculatePriceWithVAT_shouldCalculateTheCorrectPrice() {
        double priceCalculated = productPricingService.calculatePriceWithVAT(20.0);

        assertThat(priceCalculated).isEqualTo(24.2);
    }

}
