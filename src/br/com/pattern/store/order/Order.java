package br.com.pattern.store.order;

import br.com.pattern.store.budget.Budget;

import java.time.LocalDateTime;

public class Order {
    private String costumer;
    private LocalDateTime date;
    private Budget budget;

    public Order(String costumer, LocalDateTime date, Budget budget) {
        this.costumer = costumer;
        this.date = date;
        this.budget = budget;
    }

    public String getCostumer() {
        return costumer;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Budget getBudget() {
        return budget;
    }
}
