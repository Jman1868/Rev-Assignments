package week2.day2.assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SalaryCalculatorTest {

    private static final double DELTA = 0.001;

    @Test
    void testHraCalculation() {
        assertEquals(2000.0, SalaryCalculator.calculateHra(10000.0), DELTA);
    }

    @Test
    void testDaCalculation() {
        assertEquals(1000.0, SalaryCalculator.calculateDa(10000.0), DELTA);
    }

    @Test
    void testGrossCalculation() {
        assertEquals(13000.0, SalaryCalculator.calculateGross(10000.0), DELTA);
    }

    @Test
    void testTaxWhenGrossIsExactlyThreshold() {
        assertEquals(0.0,
                SalaryCalculator.calculateProfessionalTax(20000.0),
                DELTA);
    }

    @Test
    void testTaxWhenGrossIsAboveThreshold() {
        assertEquals(200.0,
                SalaryCalculator.calculateProfessionalTax(20000.01),
                DELTA);
    }

    @Test
    void testNetSalaryCalculation() {
        assertEquals(12800.0,
                SalaryCalculator.calculateNet(13000.0, 200.0),
                DELTA);
    }
}
