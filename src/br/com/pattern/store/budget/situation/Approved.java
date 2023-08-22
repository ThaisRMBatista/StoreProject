package br.com.pattern.store.budget.situation;

import br.com.pattern.store.budget.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetSituation{

    public BigDecimal calculateExtraDiscountAmount(Budget budget) {
        return budget.getAmount().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void toFinished(Budget budget) {
        budget.setSituation(new Finished());
    }
}
