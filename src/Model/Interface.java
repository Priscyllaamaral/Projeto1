/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Interface {
	
	private Livraria livraria;
	private Funcionario funcionarioLogado;
        private static int roda = 0;
       
	
	public Interface() throws Exception{
		livraria  = Livraria.getInstancia();
		funcionarioLogado = null;
		inicializaLivraria();
               
             
        }
	
	public boolean login(String f, String senha) {
        
                if(livraria.getListaFuncionarios().get(f) != null) {
			if(livraria.getListaFuncionarios().get(f).getSenha().equals(senha)) {
				funcionarioLogado = livraria.getListaFuncionarios().get(f);
                                return true;
			}
		}
                return false;
	}
	
	public void inicializaLivraria() throws Exception {
            
            
            if(roda == 0){
               
            try {
                livraria.getEstoque().cadastrarLivro("Crepusculo","Stephenie Meyer" ,"Abril", 50.00, 001);
                livraria.getEstoque().cadastrarLivro("Lua Nova","Stephenie Meyer" ,"Abril", 45.00, 002);
		livraria.getEstoque().cadastrarLivro("Amanhecer", "Stephenie Meyer","Abril", 60.00, 003);
		livraria.getEstoque().cadastrarLivro("Eclipse", "Stephenie Meyer ","Abril", 35.00, 004);
		livraria.getEstoque().cadastrarLivro("Crepusculo","Stephenie Meyer" ,"Abril", 50.00, 001);
		livraria.getEstoque().cadastrarLivro("O Leão, a Feiticeira e o Guarda-Roupa","C. S. Lewis" ,"Arqueiro", 50.00, 005);
		livraria.getEstoque().cadastrarLivro("Príncipe Caspian","C. S. Lewis" , "Arqueiro",55.00, 006);
		livraria.getEstoque().cadastrarLivro("A Cadeira de Prata","C. S. Lewis" ,"Arqueiro", 45.00, 007);
		livraria.getEstoque().cadastrarLivro("O Sobrinho do Mago","C. S. Lewis" ,"Arqueiro", 50.00, 010);
		livraria.getEstoque().cadastrarLivro("A Última Batalha","C. S. Lewis" ,"Arqueiro", 50.00, 011);
                livraria.getEstoque().cadastrarLivro("Crepusculo","Stephenie Meyer" ,"Abril", 50.00, 001);
                livraria.getEstoque().cadastrarLivro("Lua Nova","Stephenie Meyer" ,"Abril", 45.00, 002);
		livraria.getEstoque().cadastrarLivro("Amanhecer", "Stephenie Meyer","Abril", 60.00, 003);
		livraria.getEstoque().cadastrarLivro("Eclipse", "Stephenie Meyer ","Abril", 35.00, 004);
		livraria.getEstoque().cadastrarLivro("Crepusculo","Stephenie Meyer" ,"Abril", 50.00, 001);
		livraria.getEstoque().cadastrarLivro("O Leão, a Feiticeira e o Guarda-Roupa","C. S. Lewis" , "Arqueiro",50.00, 005);
		livraria.getEstoque().cadastrarLivro("Príncipe Caspian","C. S. Lewis" ,"Arqueiro", 55.00, 006);
		livraria.getEstoque().cadastrarLivro("A Cadeira de Prata","C. S. Lewis" , "Arqueiro",45.00, 007);
		livraria.getEstoque().cadastrarLivro("O Sobrinho do Mago","C. S. Lewis" , "Arqueiro",50.00, 010);
		livraria.getEstoque().cadastrarLivro("A Última Batalha","C. S. Lewis" , "Arqueiro",50.00, 011);
                livraria.getEstoque().cadastrarLivro("Crepusculo","Stephenie Meyer" ,"Abril", 50.00, 001);
                livraria.getEstoque().cadastrarLivro("Lua Nova","Stephenie Meyer" ,"Abril", 45.00, 002);
		livraria.getEstoque().cadastrarLivro("Amanhecer", "Stephenie Meyer","Abril", 60.00, 003);
		livraria.getEstoque().cadastrarLivro("Eclipse", "Stephenie Meyer ","Abril", 35.00, 004);
		livraria.getEstoque().cadastrarLivro("Crepusculo","Stephenie Meyer" ,"Abril", 50.00, 001);
		livraria.getEstoque().cadastrarLivro("O Leão, a Feiticeira e o Guarda-Roupa","C. S. Lewis" ,"Arqueiro", 50.00, 005);
		livraria.getEstoque().cadastrarLivro("Príncipe Caspian","C. S. Lewis" ,"Arqueiro", 55.00, 006);
		livraria.getEstoque().cadastrarLivro("A Cadeira de Prata","C. S. Lewis" , "Arqueiro",45.00, 007);
		livraria.getEstoque().cadastrarLivro("O Sobrinho do Mago","C. S. Lewis" ,"Arqueiro", 50.00, 010);
		livraria.getEstoque().cadastrarLivro("A Última Batalha","C. S. Lewis" , "Arqueiro",50.00, 011);
            
                
		livraria.cadastrarFuncionario("Aquila", "", "Jatobá", "3333-4444", "aquila@gmail.com", "Programador", "");
		livraria.cadastrarFuncionario("Priscylla", "00968756158", "Salgadinho","77776666", "priscylla@gmail.com", "Programador","12345");
		
                livraria.cadastrarCliente("00968756100", "Joana","Salgadinho","3333-4444", "joana@gmail.com");
                livraria.cadastrarCliente("00968756101", "Joao","Salgadinho","3333-4555", "joao@gmail.com");
            
            
            
            } 
            
            
            
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }}
		roda = 1;
		
	}       
	
	public Livraria getLivraria() {
		return Livraria.getInstancia();
	}

	public void setLivraria(Livraria livraria) {
		this.livraria = livraria;
	}

	public Funcionario getFuncionarioLogado() {
		return funcionarioLogado;
	}

	public void setFuncionarioLogado(Funcionario funcionarioLogado) {
		this.funcionarioLogado = funcionarioLogado;
	}

	
	
	
	

}
