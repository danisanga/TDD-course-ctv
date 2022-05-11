package tv.codely.java_basic_skeleton.daniel.utils.productPricingExercise;

import org.junit.jupiter.api.Test;
import tv.codely.java_basic_skeleton.daniel.util.productPricingExercise.CountryVATUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class CountryVATUtilsTest {

    private final CountryVATUtils countryVATUtils = new CountryVATUtils();

    @Test
    void getVATValueByCountry_shouldReturned() {
        double vatAmount = countryVATUtils.getVATValueByCountry("ES");

        assertThat(vatAmount).isEqualTo(21);
    }

    @Test
    void getVATValueByCountry_shouldReturnZero_whenNoCountryIsSpecified() {
        double vatAmount = countryVATUtils.getVATValueByCountry("");

        assertThat(vatAmount).isZero();
    }

}
