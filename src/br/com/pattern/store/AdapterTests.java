package br.com.pattern.store;

import br.com.pattern.store.budget.Budget;
import br.com.pattern.store.budget.BudgetRecord;
import br.com.pattern.store.http.JavaHttpClient;

import java.math.BigDecimal;

public class AdapterTests {

    public static void main(String[] args) {
        Budget budget = new Budget(BigDecimal.TEN, 1);
        budget.toApprove();
        budget.toFinish();

        BudgetRecord record = new BudgetRecord(new JavaHttpClient());
        record.resgister(budget);
    }
}
