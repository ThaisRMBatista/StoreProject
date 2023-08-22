import taxes.TaxCalculator;
import taxes.ICMS;
import taxes.ISS;
import budget.Budget;

import java.math.BigDecimal;

public class TaxTests {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator calculadora = new TaxCalculator();

        System.out.println(calculadora.calculate(budget, new ICMS()));
        System.out.println(calculadora.calculate(budget, new ISS()));
    }
}
