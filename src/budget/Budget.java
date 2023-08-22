package budget;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal amount;
    private int qtdProducts;
    private String situation;

    public Budget(BigDecimal amount) {
        this.amount = amount;
    }

    public Budget(BigDecimal amount, int qtdProducts) {
        this.amount = amount;
        this.qtdProducts = qtdProducts;
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscountAmount = BigDecimal.ZERO;
        if (situation.equals("UNDER ANALYSIS")) {
            extraDiscountAmount = new BigDecimal("0.05");
        } else if (situation.equals("APPROVED")) {
            extraDiscountAmount = new BigDecimal("0.02");
        }
        this.amount = this.getAmount().subtract(extraDiscountAmount);
    }

    public void toApprove() {
        this.situation = "APPROVED";
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getQtdProducts() {
        return qtdProducts;
    }
}
