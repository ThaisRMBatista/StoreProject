package discounts;

import budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountForQtdGreaterThanFive extends Discount{

    public BudgetDiscountForQtdGreaterThanFive(Discount next) {
        super(next);
    }

    @Override
    protected boolean isApply(Budget budget) {
        return budget.getQtdProducts() > 5;
    }

    @Override
    protected BigDecimal performCalculation(Budget budget) {
        return budget.getAmount().multiply(new BigDecimal("0.1"));
    }
}
