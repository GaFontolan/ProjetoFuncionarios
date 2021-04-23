
package classeabstrataexemplo;

public class FuncionarioM extends Funcionario{
     private double salario;
    private double desconto;

    public FuncionarioM() {
    }

    public FuncionarioM(double salario, double desconto,int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
        this.desconto = desconto;
    }

    @Override
    public String imprimir() {
        return super.imprimir()+"\nSalário: " + salario + "\nDesconto: " + desconto +
                "\nTotal: " + calcularSalario();
    }   
    
    @Override
    public double calcularSalario() {
        return salario - desconto;
    }
    
}
