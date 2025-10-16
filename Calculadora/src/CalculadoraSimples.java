import javax.swing.JOptionPane;

public class CalculadoraSimples {
    public static void main(String[] args) {
        try {
            String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
            String input2 = JOptionPane.showInputDialog("Digite o segundo número:");

            double numero1 = Double.parseDouble(input1);
            double numero2 = Double.parseDouble(input2);

            String[] opcoes = {"+", "-", "×", "÷"};
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha a operação:",
                    "Calculadora",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            double resultado = 0;
            String operacao = "";
            boolean operacaoValida = true;

            switch (escolha) {
                case 0:
                    resultado = numero1 + numero2;
                    operacao = "+";
                    break;
                case 1:
                    resultado = numero1 - numero2;
                    operacao = "-";
                    break;
                case 2:
                    resultado = numero1 * numero2;
                    operacao = "×";
                    break;
                case 3:
                    if (numero2 == 0) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Erro: Divisão por zero não é permitida!",
                                "Erro",
                                JOptionPane.ERROR_MESSAGE
                        );
                        operacaoValida = false;
                    } else {
                        resultado = numero1 / numero2;
                        operacao = "÷";
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Nenhuma operação foi selecionada!",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE
                    );
                    operacaoValida = false;
            }

            if (operacaoValida) {
                JOptionPane.showMessageDialog(
                        null,
                        String.format("%.2f %s %.2f = %.2f", numero1, operacao, numero2, resultado),
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro: Entrada inválida! Por favor, digite apenas números.",
                    "Erro de Formato",
                    JOptionPane.ERROR_MESSAGE
            );
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Operação cancelada pelo usuário.",
                    "Cancelado",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }
}