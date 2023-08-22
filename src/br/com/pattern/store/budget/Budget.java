package br.com.pattern.store.budget;

import br.com.pattern.store.budget.situation.BudgetSituation;
import br.com.pattern.store.budget.situation.UnderAnalysis;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal amount;
    private int qtdProducts;
    private BudgetSituation situation;

    public Budget(BigDecimal amount) {
        this.amount = amount;
    }

    public Budget(BigDecimal amount, int qtdProducts) {
        this.amount = amount;
        this.qtdProducts = qtdProducts;
        this.situation = new UnderAnalysis();
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscountAmount =
                this.situation.calculateExtraDiscountAmount(this);
        this.amount = this.getAmount().subtract(extraDiscountAmount);
    }

    public void toDisapprove() {
        this.situation.toReprove(this);
    }

    public void toFinish() {
        this.situation.toFinished(this);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getQtdProducts() {
        return qtdProducts;
    }

    public void setSituation(BudgetSituation situation) {
        this.situation = situation;
    }

    public BudgetSituation getSituation() {
        return situation;
    }
}
