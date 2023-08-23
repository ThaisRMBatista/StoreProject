package br.com.pattern.store.order;

import java.math.BigDecimal;

public class GenerateOrder {

    private String costumer;
    private BigDecimal budgetAmount;
    private int qtdProducts;

    public GenerateOrder(String costumer, BigDecimal budgetAmount, int qtdProducts) {
        this.costumer = costumer;
        this.budgetAmount = budgetAmount;
        this.qtdProducts = qtdProducts;
    }

    public String getCostumer() {
        return costumer;
    }

    public BigDecimal getBudgetAmount() {
        return budgetAmount;
    }

    public int getQtdProducts() {
        return qtdProducts;
    }
}
