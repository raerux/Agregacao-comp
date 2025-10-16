public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem("Teclado", 2, 150.00);
        pedido.adicionarItem("Mouse", 1, 80.00);

        pedido.mostrarPedido();
    }
}