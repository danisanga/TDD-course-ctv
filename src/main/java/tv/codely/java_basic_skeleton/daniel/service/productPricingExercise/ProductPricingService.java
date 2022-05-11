package tv.codely.java_basic_skeleton.daniel.service.productPricingExercise;

public class ProductPricingService {

    public ProductPricingService() {
        // Empty constructor.
    }

    public double calculatePriceWithVAT(final double price, final String countryISO) {

        double vatValue = 0;

        if ("ES".equals(countryISO)) {
            vatValue = calculateVATAmount(price, 21);
        } else if ("AU".equals(countryISO)) {
            vatValue = calculateVATAmount(price, 10);
        }

        return vatValue + price;
    }

    /**
     * Calculate amount to increase to the product price by specific price and vat value.
     *
     * @param price     the product price
     * @param vatValue  the vat value
     * @return the calculated price of the product
     */
    private double calculateVATAmount(
        final double price,
        final double vatValue) {

        return vatValue * price / 100;

    }

}
