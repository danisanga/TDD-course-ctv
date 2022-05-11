package tv.codely.java_basic_skeleton.daniel.service.productPricingExercise;

public class ProductPricingService {

    public ProductPricingService() {
        // Empty constructor.
    }

    public double calculatePriceWithVAT(final double price) {

        final double vat = 21 * price / 100;

        return vat + price;
    }
}
