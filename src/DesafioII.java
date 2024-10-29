import javax.swing.JOptionPane;

public class DesafioII {
    public static void main(String[] args) {
        // Define o tamanho do vetor e as opções para as escolhas
        int tamanho = 3; // Por exemplo, 3 escolhas
        int[] escolhas = new int[tamanho];
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3", "Cancelar"};

        // Loop para capturar as escolhas do usuário e armazenar no vetor
        for (int i = 0; i < tamanho; i++) {
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção para a posição " + (i + 1) + ":",
                    "Sistema de Escolhas",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            // Verifica se o usuário escolheu "Cancelar" ou fechou a janela
            if (escolha == -1 || escolha == 3) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return; // Encerra o programa se o usuário cancelar ou fechar
            }

            // Armazena a escolha no vetor
            escolhas[i] = escolha;
        }

        // Exibe o conteúdo do vetor com as escolhas feitas
        String mensagem = "Escolhas realizadas:\n";
        for (int i = 0; i < escolhas.length; i++) {
            mensagem += "Posição " + (i + 1) + ": " + opcoes[escolhas[i]] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}