package OCP_VIOLACAO;

/**
 * @author Daniel Müller
 * @version 1.0
 * */
public class DescontoAniversario implements EstrategiaDeDesconto{

    /**
     * Aplicar desconto de aniversario de 20% de desconto
     * */
    @Override
    public double aplicarDesconto(double valorBruto) {
        return valorBruto * 0.80; // 20% de desconto
    }
}
