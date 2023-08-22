package br.com.pattern.store;

import br.com.pattern.store.budget.Budget;
import br.com.pattern.store.discounts.DiscountCalculator;

import java.math.BigDecimal;

public class DiscountTests {
    public static void main(String[] args) {
        Budget b1 = new Budget(new BigDecimal("100"), 1);
        Budget b2 = new Budget(new BigDecimal("200"), 6);
        Budget b3 = new Budget(new BigDecimal("900"), 4);

        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println(calculator.calculate(b1));
        System.out.println(calculator.calculate(b2));
        System.out.println(calculator.calculate(b3));
    }
}
