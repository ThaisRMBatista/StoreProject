package br.com.pattern.store.order;

import br.com.pattern.store.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GenerateOrder {

    private String costumer;
    private BigDecimal budgetAmount;
    private int qtdProducts;

    public GenerateOrder(String costumer, BigDecimal budgetAmount, int qtdProducts) {
        this.costumer = costumer;
        this.budgetAmount = budgetAmount;
        this.qtdProducts = qtdProducts;
    }

    public void execute() {
        Budget budget = new Budget(this.budgetAmount, this.qtdProducts);

        Order order = new Order(costumer, LocalDateTime.now(), budget);

        System.out.println("Save order in dataBase");
        System.out.println("Send email with data order");
    }
}
