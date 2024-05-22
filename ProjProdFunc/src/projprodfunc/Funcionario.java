package projprodfunc;

import javax.swing.JOptionPane;

public class Funcionario {
    public String nome;
    public String funcao;
    public double salario;
    public int codigo;

    public void Cadastrar(String nm, String fun, double s, int cod){
        this.nome = nm;
        this.funcao = fun;
        this.salario = s;
        this.codigo = cod;
        
        JOptionPane.showMessageDialog(null, "dados cadastrados com sucesso!!!");
    }
    
    public void Exibir(){
        JOptionPane.showMessageDialog(null, "Nome do funcionário: " +this.nome+ "\nFunção: " +this.funcao+ "\nSalário mensal: " +this.salario+ "\nCódigo: " +this.codigo);
    }
}