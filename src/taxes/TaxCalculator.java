package taxes;

import budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Budget budget, Taxes taxes) {
        return taxes.calcular(budget);
    }
}
