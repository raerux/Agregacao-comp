import java.util.ArrayList;
import java.util.List;

class Funcionario {
    private final String nome;

    Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Departamento {
    private final String nome;
    private final List<Funcionario> funcionarios = new ArrayList<>();

    Departamento(String nome) {
        this.nome = nome;
    }

    public void adicionar(Funcionario f) {
        funcionarios.add(f);
    }
}

public class ExemploAgregacao1 {
    public static void main(String[] args) {
        Funcionario ana = new Funcionario("Ana");
        Departamento rh = new Departamento("RH");
        rh.adicionar(ana);
    }
}