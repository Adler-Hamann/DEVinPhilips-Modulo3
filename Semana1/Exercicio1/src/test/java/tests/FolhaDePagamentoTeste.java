package tests;
import classes.FolhaDePagamento;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FolhaDePagamentoTeste {

    @Test
    @DisplayName("Calcula o valor do salário bruto do funcionário")
    void calcularSalarioBruto() {
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

        Double resultado = folhaDePagamento.calcularSalarioBruto(1200.0, 100.0, "Funcionario");
        assertNotNull(resultado);
        assertEquals(1300, resultado);
    }

    @Test
    @DisplayName("Calcula o valor do salário liquido do funcionário")
    void calcularSalarioLiquido(){
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

        List<Double> descontos = new ArrayList<>();
        descontos.add(20.0);
        descontos.add(178.0);
        descontos.add(13.5);
        Double resultado = folhaDePagamento.calcularSalarioLiquido(1200.0, descontos);
        assertNotNull(resultado);
    }


}
