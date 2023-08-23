package br.com.pattern.store.order.action;

import br.com.pattern.store.order.Order;

public interface ActionAfterNewOrder {

    void executeAction(Order order);
}
