package tv.codely.java_basic_skeleton.daniel.service.productPricingExercise;

import tv.codely.java_basic_skeleton.daniel.util.productPricingExercise.CountryVATUtils;

public class ProductPricingService {

    public ProductPricingService() {
        // Empty constructor.
    }

    /**
     * Calculate total price by country ISO.
     *
     * @param price         the product price
     * @param countryISO    the country ISO
     * @return  the calculated total price.
     */
    public double calculateTotalPriceWithVAT(final double price, final String countryISO) {
        double vatValue = calculateVATAmountByCountry(price, countryISO);

        return vatValue + price;
    }

    /**
     * Calculate amount to increase to the product price by specific price and country ISO.
     *
     * @param price         the product price
     * @param countryISO    the country ISO
     * @return the calculated vat amount of the product
     */
    private double calculateVATAmountByCountry(
        final double price,
        final String countryISO) {

        final CountryVATUtils countryVATUtils = new CountryVATUtils();

        double vatValueByCountry = countryVATUtils.getVATValueByCountry(countryISO);

        return vatValueByCountry * price / 100;

    }
}
