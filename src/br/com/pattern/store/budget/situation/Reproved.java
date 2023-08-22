package br.com.pattern.store.budget.situation;

import br.com.pattern.store.budget.Budget;

public class Reproved extends BudgetSituation {

    @Override
    public void toFinished(Budget budget) {
        budget.setSituation(new Finished());
    }
}
