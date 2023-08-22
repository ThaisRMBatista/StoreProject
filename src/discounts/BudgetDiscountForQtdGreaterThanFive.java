package discounts;

import budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountForQtdGreaterThanFive extends Discount{

    public BudgetDiscountForQtdGreaterThanFive(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        if (budget.getQtdProducts() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
        return next.calculate(budget);
    }
}
