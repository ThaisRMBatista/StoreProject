package br.com.pattern.store.budget.situation;

import br.com.pattern.store.budget.Budget;

import java.math.BigDecimal;

public class UnderAnalysis extends BudgetSituation{

    public BigDecimal calculateExtraDiscountAmount(Budget budget) {
        return budget.getAmount().multiply(new BigDecimal("0.05"));
    }

    public void toApprove(Budget budget) {
        budget.setSituation(new Approved());
    }

    public void toReprove(Budget budget) {
        budget.setSituation(new Reproved());
    }
}
