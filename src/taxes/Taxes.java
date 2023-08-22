package taxes;

import budget.Budget;

import java.math.BigDecimal;

public interface Taxes {
    BigDecimal calcular(Budget budget);
}
