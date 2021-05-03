/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author priscylla
 */
public class ClienteController {
    
    
    private LivrariaController lc;
    
    public ClienteController() throws Exception{
        lc = new LivrariaController();
        
    }
    
    public void setInter(InterfaceController ic){
        lc.setInter(ic);
    }
    
    
    public void cadastrarCliente(String cpf, String nome, String endereco , 
                String telefone, String email) throws Exception{
        
      
        lc.cadastrarCliente(cpf, nome, endereco, telefone, email);
        
    }
    
    public InterfaceController getInter(){
        return lc.getInter();
    }
   
    
    public Cliente getCliente(String cpf){
       return lc.getCliente(cpf);
    }
    
    
   public void excluirCliente(String cpf){
       lc.excluirCliente(cpf);
   
   }
   
   public ArrayList<String[]> getClientes(){
       return lc.getClientes();
   }
    
   public boolean existeCliente(String cpf){
       return lc.existeCliente(cpf);
   }
   
  
   public String[] getClient(String cpf){
       String [] array = new String [5];
       
       array[0] = lc.getInter().getInterface().getLivraria().getListaClientes().get(cpf).getNome();
       array[1] = lc.getInter().getInterface().getLivraria().getListaClientes().get(cpf).getCpf();
       array[2] = lc.getInter().getInterface().getLivraria().getListaClientes().get(cpf).getEndereço();
       array[3] = lc.getInter().getInterface().getLivraria().getListaClientes().get(cpf).getTelefone();
       array[4] = lc.getInter().getInterface().getLivraria().getListaClientes().get(cpf).getEmail();
 
       return array;
   }
    
   
   public void editarCliente(String nome, String cpf, String endereco , 
                String telefone, String email) {
       
       Cliente c = lc.getInter().getInterface().getLivraria().getListaClientes().get(cpf);
       
       c.setCpf(cpf);
       c.setEmail(email);
       c.setNome(nome);
       c.setTelefone(telefone);
       c.setEndereço(endereco);
       
       
       
   }
   
  
   
   
}
