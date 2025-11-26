package OCP_VIOLACAO;

/**
 * @author Daniel Müller
 * @version 1.0
 * */
public class DescontoSazonal implements EstrategiaDeDesconto {

    /**
     * Aplicar desconto sezonal de 5% de desconto
     * */
    @Override
    public double aplicarDesconto(double valorBruto) {
        return valorBruto * 0.95; // 5% de desconto
    }
}
