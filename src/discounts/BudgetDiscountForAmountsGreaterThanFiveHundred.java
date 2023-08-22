package discounts;

import budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountForAmountsGreaterThanFiveHundred extends Discount{

    public BudgetDiscountForAmountsGreaterThanFiveHundred(Discount next) {
        super(next);
    }

    @Override
    protected boolean isApply(Budget budget) {
        return budget.getAmount().compareTo(new BigDecimal("500")) > 0 ;
    }

    @Override
    protected BigDecimal performCalculation(Budget budget) {
        return budget.getAmount().multiply(new BigDecimal("0.1"));
    }
}
