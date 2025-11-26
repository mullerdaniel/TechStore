package OCP_VIOLACAO;

/**
 * Aqui vai centralizar tudo que foi criado
 * @author Daniel Müller
 * @version 1.0
 * */
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("001", 100.0, 3, "cliente@techstore.com", TipoDesconto.ANIVERSARIO);

        /**
         * Criando uma estratégia de desconto (Desconto Aniversário)
         * @see DescontoAniversario(pedido)
         * */
        EstrategiaDeDesconto estrategia = new DescontoAniversario();

        /**
         * Aplicar Desconto
         * */
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        double valorComDesconto = calculadora.aplicarDesconto(pedido, estrategia);

        System.out.println("Valor com desconto de Aniversário: " + valorComDesconto);

        /**
         * Vai testar outro descontos
         * */
        pedido.setTipoDesconto(TipoDesconto.CUPOM);
        estrategia = new DescontoCupom();
        valorComDesconto = calculadora.aplicarDesconto(pedido, estrategia);

        System.out.println("Valor com desconto de Cupom: " + valorComDesconto);
    }
}
