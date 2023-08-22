package taxes;

import budget.Budget;

import java.math.BigDecimal;

public class ICMS implements Taxes {
    @Override
    public BigDecimal calcular(Budget budget) {
        return budget.getAmount().multiply(new BigDecimal("0.1"));
    }
}
