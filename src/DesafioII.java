import javax.swing.JOptionPane;

public class DesafioII {

    public static void main(String[] args) {
        String [] clnts = new String [3];
        String [] anmls = new String [3];
        String [] outroAnml = new String[3];
        String [] tpDAnml = {"Cachorro", "Gato", "Passáro", "Outro"};
        int    [] grdTpDAnml = new int [3];
        String [] tpDSrvç = {"Banho", "Tosa"};
        int    [] grdTpDSrvç = new int [3];
        String [] sttsDSrvç = {"Agendado", "Realizado"};
        int    [] grdSttsDSrvç = new int [3];
        int escolha, escolha2, escolha3;
        int [] nmrsDRgstrs = new int[3];
        String inforgstrs = "";

        for(int i = 0; i < nmrsDRgstrs.length; i++){
            clnts[i] = JOptionPane.showInputDialog(null, "Informe seu nome");
            anmls[i] = JOptionPane.showInputDialog(null, "Informe o nome do animal");
            escolha = JOptionPane.showOptionDialog(null, "Informe o tipo do animal", "Tipos de animais",
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tpDAnml, tpDAnml[0]);
            grdTpDAnml[i] = escolha;

            if(escolha == 0 || escolha == 1 || escolha == 2){

                escolha2 = JOptionPane.showOptionDialog(null, "Informe o tipo de serviço", "Tipos de serviço",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tpDSrvç, tpDSrvç[0]);
                grdTpDSrvç[i] = escolha2;

                if (escolha2 == 0 || escolha2 == 1){
                    escolha3 = JOptionPane.showOptionDialog(null, "Informe a situação do serviço", "Status do serviço",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, sttsDSrvç, sttsDSrvç[0]);
                    grdSttsDSrvç[i] = escolha3;

                    if(escolha3 == 0 || escolha3 == 1){

                        JOptionPane.showMessageDialog(null, "Registor realizado");
                    }
                }

            }

            else if(escolha == 3){
                outroAnml[i] = JOptionPane.showInputDialog(null, "Informe o tipo de animal");
                grdTpDAnml[i] = Integer.parseInt(outroAnml[i]);
                escolha2 = JOptionPane.showOptionDialog(null, "Informe o tipo de serviço", "Tipos de serviço",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tpDSrvç, tpDSrvç[0]);
                grdTpDSrvç[i] = escolha2;

                if (escolha2 == 0 || escolha2 == 1){
                    escolha3 = JOptionPane.showOptionDialog(null, "Informe a situação do serviço", "Status do serviço",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, sttsDSrvç, sttsDSrvç[0]);
                    grdSttsDSrvç[i] = escolha3;

                    if(escolha3 == 0 || escolha3 == 1){

                        JOptionPane.showMessageDialog(null, "Registro realizado");
                    }
                }
            }
        }

        for(int i = 0; i < grdTpDAnml.length; i++){
            inforgstrs += "Nome do cliente: " + clnts[i] + "\n";
            inforgstrs += "Nome do animal: " + anmls[i] + "\n";
            inforgstrs += "Tipo do anima: " + tpDAnml[grdTpDAnml[i]] + "\n\n";
        }

        JOptionPane.showMessageDialog(null, inforgstrs);
    }
    
}
