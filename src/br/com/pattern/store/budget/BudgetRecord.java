package br.com.pattern.store.budget;

import br.com.pattern.store.DomainException;
import br.com.pattern.store.http.HttpAdapter;

import java.util.Map;

public class BudgetRecord {

    private HttpAdapter http;

    public BudgetRecord(HttpAdapter http) {
        this.http = http;
    }

    public void resgister(Budget budget) {
        if (!budget.isFinished()) {
            throw new DomainException("Budget is not finished");
        }
        String url = "http://api.external/budget";
        Map<String, Object> data = Map.of("amount", budget.getAmount(),
                "qtdProducts", budget.getQtdProducts()
        );
        http.post(url, data);
    }
}
