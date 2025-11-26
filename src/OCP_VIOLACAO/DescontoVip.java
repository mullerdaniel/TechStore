package OCP_VIOLACAO;

public class DescontoVip implements EstrategiaDeDesconto {
    @Override
    public double aplicarDesconto(double valorBruto) {
        return valorBruto * 0.85; // 15% de desconto
    }
}
