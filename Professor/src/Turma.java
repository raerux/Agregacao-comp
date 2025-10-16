public class Turma {
    private String codigo;
    private Professor professor;

    public Turma(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void resumo() {
        if (professor != null) {
            System.out.println("Código da turma: " + codigo);
            System.out.println("Nome do professor: " + professor.getNome());
        } else {
            System.out.println("Código da turma: " + codigo);
            System.out.println("Nenhum professor associado.");
        }
    }
}