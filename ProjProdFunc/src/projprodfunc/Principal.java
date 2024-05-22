package projprodfunc;

import javax.swing.JOptionPane;

public class Principal{
    
    public static void main(String[] args) {
        
        String nome=JOptionPane.showInputDialog("Digite o nome do produto");
        int qtd=Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade"));
        Double valorU=Double.parseDouble(JOptionPane.showInputDialog("digite o valor unitario"));
        int codigo=Integer.parseInt(JOptionPane.showInputDialog("digite o codigo"));
        
        //Criando a instancia aluno para a classe aluno
        Produto p1= new Produto();
        
        //Chamada dos métodos
        p1.Cadastrar(nome, qtd, valorU, codigo);
        p1.Exibir();
        
        String nome2=JOptionPane.showInputDialog("Digite o nome do funcionario");
        String funcao=JOptionPane.showInputDialog("digite a função");
        Double salario=Double.parseDouble(JOptionPane.showInputDialog("digite o valor mensal do salario"));
        int codigo2=Integer.parseInt(JOptionPane.showInputDialog("digite o codigo"));
        
        //Criando a instancia aluno para a classe aluno
        Funcionario f1= new Funcionario();
        
        //Chamada dos métodos
        f1.Cadastrar(nome2, funcao, salario, codigo2);
        f1.Exibir();
    }
}