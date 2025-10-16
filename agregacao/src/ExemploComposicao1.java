import java.util.ArrayList;
import java.util.List;

class Casa {
    private final List<Comodo> comodos = new ArrayList<>();

    Casa(int qtdQuartos) {
        for (int i = 1; i <= qtdQuartos; i++) {
            comodos.add(new Comodo("Quarto " + i));
        }
    }

    private static class Comodo {
        private final String nome;

        Comodo(String nome) {
            this.nome = nome;
        }
    }
}

public class ExemploComposicao1 {
    public static void main(String[] args) {
        Casa casa = new Casa(3);
    }
}