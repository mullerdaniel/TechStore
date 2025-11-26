package OCP_VIOLACAO;

public class DescontoSazonal implements EstrategiaDeDesconto {
    @Override
    public double aplicarDesconto(double valorBruto) {
        return valorBruto * 0.95; // 5% de desconto
    }
}
