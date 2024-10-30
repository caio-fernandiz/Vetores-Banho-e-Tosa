import javax.swing.JOptionPane;

public class DesafioII {

    public static void main(String[] args) {
        String [] clnts = new String [5];
        String [] anmls = new String [5];
        String [] tpDAnml = {"Cachorro", "Gato"};
        int    [] grdTpDAnml = new int [5];
        String [] tpDSrvç = {"Banho", "Tosa"};
        int    [] grdTpDSrvç = new int [5];
        String [] sttsDSrvç = {"Agendado", "Realizado"};
        int    [] grdSttsDSrvç = new int [5];
        int [] nmrsDRgstrs = new int[5];
        int escolha, escolha2, escolha3;
        String inforgstrs = "";
        String infoagndmts = "";
        String inforltrs = "";
        int contaAgend = 0;
        int contaReliz = 0;
        int i;

        for(i = 0; i < nmrsDRgstrs.length; i++){
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

                    if(escolha3 == 0){

                        JOptionPane.showMessageDialog(null, "Registro realizado");
                        contaAgend ++;
                    }

                    else if(escolha3 == 1){

                        JOptionPane.showMessageDialog(null, "Registro realizado");
                        contaReliz++;
                    }
                }

            }
        }

        for(i = 0; i < grdTpDAnml.length; i++){
            inforgstrs += "Nome do cliente: " + clnts[i] + "\n" 
                        + "Nome do animal: " + anmls[i] + "\n" 
                        + "Tipo do anima: " + tpDAnml[grdTpDAnml[i]] + "\n\n";

        }

        for( i = 0; i < grdTpDSrvç.length; i++){
            infoagndmts += clnts[i] + " agendou " 
                        + tpDSrvç[grdTpDSrvç[i]] + " para " 
                        + anmls[i] + "\n\n";
        }

        for(i = 0; i < nmrsDRgstrs.length ; i++){
            inforltrs += clnts [i] + anmls[i] + 
            " (" + tpDAnml[grdTpDAnml[i]] + ") " + 
            sttsDSrvç[grdSttsDSrvç[i]] + "\n";
        }


        JOptionPane.showMessageDialog(null, inforgstrs);
        JOptionPane.showMessageDialog(null, infoagndmts);
        JOptionPane.showMessageDialog(null, inforltrs + 
                            "\nTotal de serviços agendados: " +contaAgend +
                            "\nTotal de serviços realizados: " +contaReliz);
        
    }
    
}
