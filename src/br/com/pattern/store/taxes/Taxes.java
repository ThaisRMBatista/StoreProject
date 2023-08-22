package br.com.pattern.store.taxes;

import br.com.pattern.store.budget.Budget;

import java.math.BigDecimal;

public interface Taxes {
    BigDecimal calcular(Budget budget);
}
