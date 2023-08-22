package br.com.pattern.store;

import br.com.pattern.store.taxes.TaxCalculator;
import br.com.pattern.store.taxes.ICMS;
import br.com.pattern.store.taxes.ISS;
import br.com.pattern.store.budget.Budget;

import java.math.BigDecimal;

public class TaxTests {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator calculadora = new TaxCalculator();

        System.out.println(calculadora.calculate(budget, new ICMS()));
        System.out.println(calculadora.calculate(budget, new ISS()));
    }
}
