package budget;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private int qtdProducts;

    public Budget(BigDecimal value) {
        this.value = value;
    }

    public Budget(BigDecimal value, int qtdProducts) {
        this.value = value;
        this.qtdProducts = qtdProducts;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQtdProducts() {
        return qtdProducts;
    }
}
