package calculadora.stock;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraCompleja implements CalculadoraStockSeguridad{
    @Override
    public List<Integer> calcula(List<Integer> stocks) {
        List<Integer> sesultados = new ArrayList<Integer>();
        for(Integer stock : stocks) {
            int resultado = 2;

            if (stock >= 10 && stock < 20) {

                resultado += (int) Math.round(stock*0.05);
            }
            else if ( stock > 20 ){

                resultado += Math.round(stock*0.1);
            }
            sesultados.add(resultado);
        }
        return sesultados;
    }
}
