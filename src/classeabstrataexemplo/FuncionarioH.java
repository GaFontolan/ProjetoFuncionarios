
package classeabstrataexemplo;

public class FuncionarioH extends Funcionario{
    private int qtdHoras;
    private double valorHoras;

    public FuncionarioH() {
    }

    public FuncionarioH(int qtdHoras, double valorHoras, int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.qtdHoras = qtdHoras;
        this.valorHoras = valorHoras;
    }

    @Override
    public String imprimir() {
        return super.imprimir();
    }
    
     @Override
    public double calcularSalario() {
        return qtdHoras * valorHoras;
    }

    
}
