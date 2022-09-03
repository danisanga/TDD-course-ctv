package com.daniel.feature.vat;

import com.daniel.feature.vat.service.productPricingExercise.ProductPricingService;

public class TotalProductPriceCalculator {

    public static void main(String[] args) {
        ProductPricingService productPricingService = new ProductPricingService();

        double totalPrice;

        totalPrice = productPricingService.calculateTotalPriceWithVAT(30.0, "ES");
        System.out.println("El precio total de este producto en España es: " + totalPrice);

        totalPrice = productPricingService.calculateTotalPriceWithVAT(30.0, "CA");
        System.out.println("El precio total de este producto en Canada es: " + totalPrice);

        totalPrice = productPricingService.calculateTotalPriceWithVAT(30.0, "AU");
        System.out.println("El precio total de este producto en Australia es: " + totalPrice);


    }

}
