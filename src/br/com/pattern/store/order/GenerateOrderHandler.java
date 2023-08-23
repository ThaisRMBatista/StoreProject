package br.com.pattern.store.order;

import br.com.pattern.store.budget.Budget;
import br.com.pattern.store.order.action.ActionAfterNewOrder;

import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {

    private List<ActionAfterNewOrder> actions;

    public GenerateOrderHandler(List<ActionAfterNewOrder> actions) {
        this.actions = actions;
    }

    public void execute(GenerateOrder data) {
        Budget budget = new Budget(data.getBudgetAmount(), data.getQtdProducts());

        Order order = new Order(data.getCostumer(), LocalDateTime.now(), budget);

        actions.forEach(a -> a.executeAction(order));
    }

}
