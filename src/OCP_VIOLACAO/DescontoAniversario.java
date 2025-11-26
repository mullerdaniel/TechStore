package OCP_VIOLACAO;

public class DescontoAniversario implements EstrategiaDeDesconto{
    @Override
    public double aplicarDesconto(double valorBruto) {
        return valorBruto * 0.80; // 5% de desconto
    }
}
