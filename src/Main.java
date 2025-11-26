package OCP_VIOLACAO;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("001", 100.0, 3, "cliente@techstore.com", TipoDesconto.ANIVERSARIO);

        // Criando a estratégia de desconto (Desconto Aniversário)
        EstrategiaDeDesconto estrategia = new DescontoAniversario();

        // Aplicando o desconto
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        double valorComDesconto = calculadora.aplicarDesconto(pedido, estrategia);

        System.out.println("Valor com desconto de Aniversário: " + valorComDesconto);

        // Testando outros descontos
        pedido.setTipoDesconto(TipoDesconto.CUPOM);
        estrategia = new DescontoCupom();
        valorComDesconto = calculadora.aplicarDesconto(pedido, estrategia);

        System.out.println("Valor com desconto de Cupom: " + valorComDesconto);
    }
}
