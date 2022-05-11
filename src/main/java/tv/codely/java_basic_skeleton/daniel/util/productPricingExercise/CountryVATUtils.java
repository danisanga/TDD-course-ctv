package tv.codely.java_basic_skeleton.daniel.util.productPricingExercise;

public class CountryVATUtils {


    public CountryVATUtils() {
        // Empty constructor.
    }

    /**
     * Get VAT amount by country ISO.
     *
     * @param countryISO    the country ISO
     * @return the VAT amount
     */
    public double getVATValueByCountry(final String countryISO) {
        if ("ES".equals(countryISO)) {
            return 21;
        }
        if ("AU".equals(countryISO)) {
            return 10;
        }

        return 0;
    }
}
