package br.com.pattern.store.order.action;

import br.com.pattern.store.order.Order;

public class SendEmailOrder implements ActionAfterNewOrder{

    @Override
    public void executeAction(Order order) {
        System.out.println("Send email with data order");
    }
}
