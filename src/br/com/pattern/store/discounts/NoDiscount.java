package br.com.pattern.store.discounts;

import br.com.pattern.store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount{

    public NoDiscount() {
        super(null);
    }

    @Override
    protected boolean isApply(Budget budget) {
        return true;
    }

    @Override
    protected BigDecimal performCalculation(Budget budget) {
        return BigDecimal.ZERO;
    }
}
