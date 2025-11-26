package OCP_VIOLACAO;

public class DescontoCupom implements EstrategiaDeDesconto {
    @Override
    public double aplicarDesconto(double valorBruto) {
        return valorBruto * 0.90; // 10% de desconto
    }
}
