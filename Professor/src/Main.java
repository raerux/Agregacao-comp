public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. João Silva");

        Turma turma = new Turma("POO-2024");

        turma.setProfessor(prof);

        turma.resumo();

        System.out.println("\nTrocando o professor...\n");

        Professor novoProfessor = new Professor("Dra. Maria Santos");
        turma.setProfessor(novoProfessor);

        turma.resumo();
    }
}