
package classeabstrataexemplo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int opc = 0;
        ArrayList<Funcionario> listFuncionarios = new ArrayList<>();
        String nome, setor, funcao;
        int cracha, tipo, horas;
        double valor, desconto;
                
        while(opc != 3){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar funcionario\n2 - Mostrar\n3 - Sair"));
            
            switch(opc){
                case 1:
                    cracha = Integer.parseInt(JOptionPane.showInputDialog("Crachá"));
                    nome = JOptionPane.showInputDialog("Nome");
                    setor = JOptionPane.showInputDialog("Setor");
                    funcao = JOptionPane.showInputDialog("Função");
                    tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo:\n1 - Horista\n2 - Mensalista"));
                    if(tipo == 1){
                        horas = Integer.parseInt(JOptionPane.showInputDialog("Qtde Horas"));
                        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
                        listFuncionarios.add(new FuncionarioH(horas, valor, cracha, nome, setor, funcao));
                    }
                    else{
                        desconto = Double.parseDouble(JOptionPane.showInputDialog("Desconto"));
                        valor = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
                        listFuncionarios.add(new FuncionarioM(valor, desconto, cracha, nome, setor, funcao));
                    }
                    break;
                case 2: 
                     String msg = "";
                    for(Funcionario f : listFuncionarios){
                        msg += f.imprimir() + "\n\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3: 
                    break;
            }
        }        
    }
    
}
