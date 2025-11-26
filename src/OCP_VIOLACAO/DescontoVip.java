package OCP_VIOLACAO;

/**
 * @author Daniel Müller
 * @version 1.0
 * */
public class DescontoVip implements EstrategiaDeDesconto {

    /**
     * Aplicar desconto vip de 15% de desconto
     * */
    @Override
    public double aplicarDesconto(double valorBruto) {
        return valorBruto * 0.85; // 15% de desconto
    }
}
