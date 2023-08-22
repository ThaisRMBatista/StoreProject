package orcamento;

import java.math.BigDecimal;

public class Orcamento {

    public BigDecimal valor;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
