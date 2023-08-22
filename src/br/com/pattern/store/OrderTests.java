package br.com.pattern.store;

import br.com.pattern.store.budget.Budget;
import br.com.pattern.store.order.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderTests {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("500"), 4);
        String costumer = "Thaís Regina";
        LocalDateTime dateTime = LocalDateTime.now();

        Order order = new Order(costumer, dateTime, budget);

        System.out.println("Save order in dataBase");
        System.out.println("Send email with data order");
    }
}
