package discounts;

import budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget) {
        if(isApply(budget)) {
            return performCalculation(budget);
        }
        return next.calculate(budget);
    }

    protected abstract boolean isApply(Budget budget);
    protected abstract BigDecimal performCalculation(Budget budget);
}
