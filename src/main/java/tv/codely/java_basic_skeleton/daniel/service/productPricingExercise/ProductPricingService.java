package tv.codely.java_basic_skeleton.daniel.service.productPricingExercise;

public class ProductPricingService {

    public ProductPricingService() {
        // Empty constructor.
    }

    public double calculatePriceWithVAT(final double price, final String countryISO) {

        double vat = 0;

        if ("ES".equals(countryISO)) {
            vat = 21 * price / 100;
        } else if ("AU".equals(countryISO)) {
            vat = 10 * price / 100;
        }

        return vat + price;
    }
}
