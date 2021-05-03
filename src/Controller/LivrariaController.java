/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Model.Funcionario;
import Model.Livro;
import Model.Venda;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author priscylla
 */
public class LivrariaController {
    
    private InterfaceController ic;
    
    public LivrariaController() throws Exception{
        ic = new InterfaceController(null,null);
    }
    
    
    public void setInter(InterfaceController ic){
        this.ic = ic;
    }
    
    public String getNomeFuncionario(){
        return ic.getInterface().getFuncionarioLogado().getNome();
    }
    
    public InterfaceController getInter(){
        return ic;
    }
    
     public ArrayList<String []> getFuncionarios(){
    ArrayList<String[]> array = new ArrayList<String []>();
        
        Iterator<String> iterator = ic.getInterface().getLivraria().getListaFuncionarios().keySet().iterator();
		while (iterator.hasNext()) {
                        String []a = new String[3]; 
			String key = iterator.next();
                        Funcionario f = ic.getInterface().getLivraria().getListaFuncionarios().get(key);
                        a[0] = f.getNome();
                        a[1] = f.getCpf();
                        a[2] = f.getFuncao();
                        array.add(a);
		}
        
        
        return array;
    }
    
    public ArrayList<String []> getClientes(){
        
        ArrayList<String[]> array = new ArrayList<String []>();
        
        Iterator<String> iterator = ic.getInterface().getLivraria().getListaClientes().keySet().iterator();
		while (iterator.hasNext()) {
                        String []a = new String[2]; 
			String key = iterator.next();
                        Cliente c = ic.getInterface().getLivraria().getListaClientes().get(key);
                        a[0] = c.getNome();
                        a[1] = c.getCpf();
                        array.add(a);
		}
        
        
        return array;
    }
    
    public ArrayList<String []> getVendas(){
        DateFormat formataData = DateFormat.getDateInstance();
         ArrayList<String[]> array = new ArrayList<String []>();
         
         Iterator<Integer> iterator = ic.getInterface().getLivraria().getListaVendas().keySet().iterator();
		while (iterator.hasNext()) {

			int key = iterator.next();
                        Venda v = ic.getInterface().getLivraria().getListaVendas().get(key);
                        String []a = new String[3]; 
			a[0] = formataData.format(v.getData());
                        a[1] = Integer.toString(v.getCodVenda());
                        a[2] = v.getFormaDePagamento().toString();
                        array.add(a);                      

		}
        return array;
    }
    
     public ArrayList<String []> getLivros(){
        DateFormat formataData = DateFormat.getDateInstance();
         ArrayList<String[]> array = new ArrayList<String []>();
         
         Iterator<Integer> iterator = ic.getInterface().getLivraria().getEstoque().getEstoque().keySet().iterator();
		while (iterator.hasNext()) {

			int key = iterator.next();
                        ArrayList<Livro> arrayLivro = ic.getInterface().getLivraria().getEstoque().getEstoque().get(key);
                        
                        for (int i = 0; i < arrayLivro.size(); i++) {
                            String []a = new String[5]; 
                             a[0] = arrayLivro.get(i).getTitulo();
                             a[1] = arrayLivro.get(i).getAutor();
                             a[2] = arrayLivro.get(i).getEditora();
                             a[3] = Integer.toString(arrayLivro.get(i).getCodigoDoLivro());
                             a[4] = Double.toString(arrayLivro.get(i).getValor());
                             array.add(a);  
                    }
                        
                        
                        
                                            

		}
        return array;
    }
    
    public boolean existeCliente(String cpf){
        return ic.getInterface().getLivraria().getListaClientes().get(cpf) != null;
    }
    
     public Cliente getCliente(String cpf){
        
        return ic.getInterface().getLivraria().getListaClientes().get(cpf);
        
    }
     
     public void cadastrarCliente(String cpf, String nome, String endereco, String telefone, String email) throws Exception{
         ic.getInterface().getLivraria().cadastrarCliente(cpf,nome,endereco,telefone,email);
         
     }
     
     public void cadastrarLivro(String titulo, String autor, String editora, double valor,
           int codigo) throws Exception{
         
         ic.getInterface().getLivraria().getEstoque().cadastrarLivro(titulo, autor, editora,
                 valor, codigo);
     }
     
     public void cadastrarFuncionario(String nome, String cpf,String endereco, String telefone, String email,
            String funcao, String senha) throws Exception{
         ic.getInterface().getLivraria().cadastrarFuncionario(nome, cpf, endereco, telefone,
                 email,funcao, senha);
     }
    
   
     public void excluirCliente(String cpf){
         ic.getInterface().getLivraria().excluirCliente(cpf);
     
     }
     
     public void excluirFuncionario(String cpf ){
         ic.getInterface().getLivraria().excluirFuncionario(cpf);
     }
    
     
     public Venda getVenda(int codigo){
         return ic.getInterface().getLivraria().getListaVendas().get(codigo);
     }

    
}


