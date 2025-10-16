import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nomeProduto, int quantidade, double precoUnitario) {
        ItemPedido item = new ItemPedido(nomeProduto, quantidade, precoUnitario);
        itens.add(item);
    }

    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("========== PEDIDO ==========");
        for (ItemPedido item : itens) {
            System.out.println(item);
        }
        System.out.println("============================");
        System.out.printf("VALOR TOTAL: R$ %.2f%n", valorTotal());
        System.out.println("============================");
    }

    class ItemPedido {
        private String nomeProduto;
        private int quantidade;
        private double precoUnitario;

        public ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        public double calcularSubtotal() {
            return quantidade * precoUnitario;
        }

        public String getNomeProduto() {
            return nomeProduto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public double getPrecoUnitario() {
            return precoUnitario;
        }

        @Override
        public String toString() {
            return String.format("%s - Qtd: %d - R$ %.2f - Subtotal: R$ %.2f",
                    nomeProduto, quantidade, precoUnitario, calcularSubtotal());
        }
    }
}