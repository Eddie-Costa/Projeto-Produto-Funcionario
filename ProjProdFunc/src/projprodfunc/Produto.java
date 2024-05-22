package projprodfunc;

import javax.swing.JOptionPane;

public class Produto {
    public String nome_produto;
    public int quantidade;
    public double valor_unitario;
    public int codigo;

    public void Cadastrar(String nm, int qtd, double vlr_uni, int cod){
        this.nome_produto = nm;
        this.quantidade = qtd;
        this.valor_unitario = vlr_uni;
        this.codigo = cod;
        
        JOptionPane.showMessageDialog(null, "dados cadastrados com sucesso!!!");
    }
    
    public void Exibir(){
        JOptionPane.showMessageDialog(null, "Nome do produto: " +this.nome_produto+ "\nQuantidade: " +this.quantidade+ "\nValor unítario: " +this.valor_unitario+ "\nCódigo: " +this.codigo);
    }
}