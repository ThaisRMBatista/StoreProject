package br.com.pattern.store;

import br.com.pattern.store.order.GenerateOrder;
import br.com.pattern.store.order.GenerateOrderHandler;
import br.com.pattern.store.order.action.SaveOrderDB;
import br.com.pattern.store.order.action.SendEmailOrder;

import java.math.BigDecimal;
import java.util.Arrays;

public class OrderTests {
    public static void main(String[] args) {
        String cliente = "Thaís";
        BigDecimal budgetAmount = new BigDecimal("300");
        int qtdProducts = Integer.parseInt("2");

        GenerateOrder newOrder = new GenerateOrder(cliente, budgetAmount, qtdProducts);
        GenerateOrderHandler newOrderHandler = new GenerateOrderHandler(
                Arrays.asList(new SaveOrderDB(), new SendEmailOrder())
        );
        newOrderHandler.execute(newOrder);
    }
}
