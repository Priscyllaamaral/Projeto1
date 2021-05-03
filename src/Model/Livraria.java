/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Livraria {

	private Estoque estoque;
	private Map<Integer, Venda> listaVendas;
	private Map<String,Cliente> listaClientes;
	private Map<String,Funcionario> listaFuncionarios;
        private GeradorDeCodigo gdc;
      
       
   private static Livraria instanciaDeLivraria = null;
   
	
	
	private Livraria() {
		estoque = new Estoque();
		listaVendas = new HashMap<Integer, Venda>();
		listaClientes = new HashMap<String,Cliente>();
		listaFuncionarios = new HashMap<String, Funcionario>();
                gdc = new GeradorDeCodigo();
              
                
             
		
	}
        
        public static Livraria getInstancia(){
            
            if(instanciaDeLivraria == null){
                instanciaDeLivraria = new Livraria();
            }
            
            return instanciaDeLivraria;
        }
        
        
               
        public int geraCodigo(){
        
            return gdc.getProximoCodigo();
        }
        
        
        
	public void efetuarVenda(Venda v) {
	
                if(listaVendas.get(v.getCodVenda())== null){
                    listaVendas.put(v.getCodVenda(), v);
                
                }

	}
        
        
        
        
        
        public void excluirCliente(Cliente c){
        
            if(listaClientes.get(c.getCpf()) != null){
                listaClientes.remove(c.getCpf());
            
            }
        
        
        }
        
         public void excluirCliente(String cpf){
        
            if(listaClientes.get(cpf)!= null){
                listaClientes.remove(cpf);
            
            }
        
        
        }
        
        public void excluirFuncionario(Funcionario func){
        
            if(listaFuncionarios.get(func.getCpf()) != null){
                listaFuncionarios.remove(func.getCpf());
            
            }
        
        
        }
        
        public void excluirFuncionario(String cpf){
        
            if(listaFuncionarios.get(cpf) != null){
                listaFuncionarios.remove(cpf);
            
            }
        
        
        }
	
	

	public void cadastrarCliente(String cpf, String nome, String endereco, String telefone, String email) throws Exception {
                Cliente c = new Cliente(nome, cpf, endereco, telefone, email);
		          
		if(listaClientes.get(c.getCpf()) == null) {
                   
			listaClientes.put(c.getCpf(), c);
		}else{
                    throw new Exception ("Cliente já cadastrado.");
                }
		
	}
	
	public void cadastrarFuncionario(String nome, String cpf, String endereco, String telefone, String email, String funcao, String senha) throws Exception  {
                
                Funcionario f = new Funcionario(nome, cpf, endereco, telefone, email, funcao, senha);
                
		if(listaFuncionarios.get(f.getCpf()) == null ) {
			
			listaFuncionarios.put(f.getCpf(), f);
		}else{
                    throw new Exception ("Funcionário já cadastrado.");
                }
		
	}
	
	public void editarCliente(String cpf, String nome, String endereco, String telefone, String email) {
		
		Cliente c = listaClientes.get(cpf);
		c.setEmail(email);
		c.setEndereço(endereco);
		c.setNome(nome);
		c.setTelefone(telefone);
		listaClientes.put(cpf,c);
		
		
	}
	
public void editarFuncionario(String nome, String cpf, String endereco, String telefone, String email, String funcao, String senha)  {
		
		Funcionario f = listaFuncionarios.get(cpf);
		f.setEmail(email);
		f.setEndereço(endereco);
		f.setNome(nome);
		f.setTelefone(telefone);
		f.setSenha(senha);
		f.setFuncao(funcao);
		listaFuncionarios.put(cpf,f);
		
		
	}
	
	public Cliente buscaCliente(String cpf) {
		
		Cliente c = listaClientes.get(cpf);
		
		return c;
		
	}
	
	public Funcionario buscaFuncionario(String cpf) {
		
		Funcionario c = listaFuncionarios.get(cpf);
		
		return c;
		
	}
	
	public int verificarQtdLivroEstoque(int codigoDoLivro) {
		
		if(estoque.getLivro(codigoDoLivro) != null) {
			return estoque.getLivro(codigoDoLivro).size();
		}
		return 0;
		
	}
	
	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public Map<Integer,Venda> getListaVendas() {
		return listaVendas;
	}

	public void setListaVendas(Map<Integer,Venda> listaVendas) {
		this.listaVendas = listaVendas;
	}

	public Map<String, Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Map<String, Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public Map<String, Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(Map<String, Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}

		
	
}


