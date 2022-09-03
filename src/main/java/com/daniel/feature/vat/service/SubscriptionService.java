package com.daniel.feature.vat.service;

import com.daniel.feature.vat.model.PriceModel;

/**
 * Subscription service class. Subscription functionalities.
 */
public class SubscriptionService {

    public SubscriptionService() {
        // Empty constructor.
    }

    PriceModel priceModel;

    /**
     * Calculate the total price for a subscription.
     * @param subscriptions     number of subscriptions.
     * @return  total price for the subscriptions.
     */
    public double calculateTotalSubscriptionPrice (final int subscriptions) {
        priceModel = new PriceModel("Normal Price", 100.0);


        return subscriptions * priceModel.getAmount();
    }
}
