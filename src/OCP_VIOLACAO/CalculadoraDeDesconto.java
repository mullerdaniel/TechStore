package OCP_VIOLACAO;

/**
 * @author Daniel Müller
 * @version 1.0
 * */
public class CalculadoraDeDesconto {

    /**
     * Metodo aplicarDesconto
     * */
    public double aplicarDesconto(Pedido pedido, EstrategiaDeDesconto estrategia) {
        return estrategia.aplicarDesconto(pedido.getValorBruto());
    }
}
