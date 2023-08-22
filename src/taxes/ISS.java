package taxes;

import budget.Budget;

import java.math.BigDecimal;

public class ISS implements Taxes {
    @Override
    public BigDecimal calcular(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }
}
