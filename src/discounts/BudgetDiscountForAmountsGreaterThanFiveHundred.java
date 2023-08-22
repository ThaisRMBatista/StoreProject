package discounts;

import budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountForAmountsGreaterThanFiveHundred extends Discount{

    public BudgetDiscountForAmountsGreaterThanFiveHundred(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        if (budget.getValue().compareTo(new BigDecimal("500")) > 0 ) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
        return next.calculate(budget);
    }
}
