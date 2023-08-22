package discounts;

import budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {

    public BigDecimal calculate(Budget budget) {
        Discount discount = new BudgetDiscountForQtdGreaterThanFive(
                new BudgetDiscountForAmountsGreaterThanFiveHundred(
                        new NoDiscount()));
        return discount.calculate(budget);
    }
}
