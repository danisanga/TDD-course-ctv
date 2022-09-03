package com.daniel.feature.vat.service.productPricingExercise;

import com.daniel.feature.vat.util.productPricingExercise.CountryVATUtils;

/**
 * Product pricing service class. Product pricing functionalities.
 */
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
    public double calculateTotalPriceWithVAT(
        final double price,
        final String countryISO) {

        final double vatValue = calculateVATAmountByCountry(price, countryISO);

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

        final int vatValueByCountry = countryVATUtils.getVATValueByCountry(countryISO);

        return vatValueByCountry * price / 100;

    }
}
