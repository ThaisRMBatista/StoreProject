package br.com.pattern.store.taxes;

import br.com.pattern.store.budget.Budget;

import java.math.BigDecimal;

public class ISS implements Taxes {
    @Override
    public BigDecimal calcular(Budget budget) {
        return budget.getAmount().multiply(new BigDecimal("0.06"));
    }
}
