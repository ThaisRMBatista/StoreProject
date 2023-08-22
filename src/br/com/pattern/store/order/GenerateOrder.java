package br.com.pattern.store.order;

import br.com.pattern.store.budget.Budget;
import br.com.pattern.store.order.action.SaveOrderDB;
import br.com.pattern.store.order.action.SendEmailOrder;

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

        SendEmailOrder sendEmailOrder = new SendEmailOrder();
        SaveOrderDB saveOrderDB = new SaveOrderDB();

        sendEmailOrder.execute(order);
        saveOrderDB.execute(order);
    }
}
