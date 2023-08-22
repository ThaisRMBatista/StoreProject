package discounts;

import budget.Budget;

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
