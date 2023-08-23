package br.com.pattern.store.order.action;

import br.com.pattern.store.order.Order;

public class SaveOrderDB implements ActionAfterNewOrder{

    @Override
    public void executeAction(Order order) {
        System.out.println("Save order in dataBase");
    }
}
