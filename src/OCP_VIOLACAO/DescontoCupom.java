package OCP_VIOLACAO;

/**
 * @author Daniel Müller
 * @version 1.0
 * */
public class DescontoCupom implements EstrategiaDeDesconto {

    /**
     * Aplicar desconto de cupum de 10% de desconto
     * */
    @Override
    public double aplicarDesconto(double valorBruto) {
        return valorBruto * 0.90; // 10% de desconto
    }
}
