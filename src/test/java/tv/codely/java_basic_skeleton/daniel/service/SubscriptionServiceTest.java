package tv.codely.java_basic_skeleton.daniel.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
class SubscriptionServiceTest {

    @InjectMocks
    private SubscriptionService testObj = new SubscriptionService();

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void calculateTotalSubscriptionPrice_ShouldReturnTheTotalPrice() {

        final double totalPrice = testObj.calculateTotalSubscriptionPrice(3);

        assertThat(totalPrice).isEqualTo(300.0);


    }

}

