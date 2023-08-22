package br.com.pattern.store.taxes;

import br.com.pattern.store.budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Budget budget, Taxes taxes) {
        return taxes.calcular(budget);
    }
}
