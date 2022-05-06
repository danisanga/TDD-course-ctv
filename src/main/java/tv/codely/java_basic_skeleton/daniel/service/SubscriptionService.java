package tv.codely.java_basic_skeleton.daniel.service;

import tv.codely.java_basic_skeleton.daniel.model.PriceModel;

public class SubscriptionService {

    public SubscriptionService() {
        // Empty constructor.
    }

    PriceModel priceModel;

    public double calculateTotalSubscriptionPrice (final int subscriptions) {
        priceModel = new PriceModel("Normal Price", 100.0);


        return subscriptions * priceModel.getAmount();
    }
}
