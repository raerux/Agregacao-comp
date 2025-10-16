import java.util.ArrayList;
import java.util.List;

class Livro {
    private final String titulo;

    Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}

class Biblioteca {
    private final List<Livro> acervo = new ArrayList<>();

    public void catalogar(Livro l) {
        acervo.add(l);
    }
}

public class ExemploAgregacao2 {
    public static void main(String[] args) {
        Livro livro = new Livro("Java Básico");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.catalogar(livro);
    }
}