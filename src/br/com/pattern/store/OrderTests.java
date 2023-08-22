package br.com.pattern.store;

import br.com.pattern.store.order.GenerateOrder;

import java.math.BigDecimal;

public class OrderTests {
    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal budgetAmount = new BigDecimal(args[1]);
        int qtdProducts = Integer.parseInt(args[2]);

        GenerateOrder newOrder = new GenerateOrder(cliente, budgetAmount, qtdProducts);
        newOrder.execute();
    }
}
