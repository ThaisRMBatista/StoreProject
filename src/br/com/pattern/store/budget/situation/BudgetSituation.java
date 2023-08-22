package br.com.pattern.store.budget.situation;

import br.com.pattern.store.DomainException;
import br.com.pattern.store.budget.Budget;

import java.math.BigDecimal;

public abstract class BudgetSituation {

    public void toApprove(Budget budget) {
        throw new DomainException("Budget cannot be approved!");
    }

    public void toReprove(Budget budget) {
        throw new DomainException("Budget cannot be disapproved!");
    }

    public void toFinished(Budget budget) {
        throw new DomainException("Budget cannot be finished!");
    }

    public BigDecimal calculateExtraDiscountAmount(Budget budget) {
        return BigDecimal.ZERO;
    }

}
