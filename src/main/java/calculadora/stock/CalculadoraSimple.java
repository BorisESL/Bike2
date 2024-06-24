package calculadora.stock;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraSimple implements CalculadoraStockSeguridad {
    @Override
    public List<Integer> calcula(List<Integer> stocks) {

        List<Integer> resultados = new ArrayList<>();
        for(Integer stock : stocks) {

            resultados.add(2);
        }
        return resultados;

    }
}
