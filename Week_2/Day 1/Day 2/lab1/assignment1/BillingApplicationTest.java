package week2.day2.assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BillingApplicationTest {

    @Test
    void testDiscountBelow1000() {
        assertEquals(0.0, BillingApplication.calculateDiscount(800), 0.001);
    }

    @Test
    void testDiscountAt1000() {
        assertEquals(50.0, BillingApplication.calculateDiscount(1000), 0.001);
    }

    @Test
    void testDiscountAt4999() {
        assertEquals(249.95, BillingApplication.calculateDiscount(4999), 0.001);
    }

    @Test
    void testDiscountAt5000() {
        assertEquals(500.0, BillingApplication.calculateDiscount(5000), 0.001);
    }

    @Test
    void testDiscountAbove5000() {
        assertEquals(700.0, BillingApplication.calculateDiscount(7000), 0.001);
    }
}