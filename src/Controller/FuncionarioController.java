/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Funcionario;
import java.util.ArrayList;
;

/**
 *
 * @author priscylla
 */
public class FuncionarioController {
    
    
     private LivrariaController lc;
     
     
     public FuncionarioController() throws Exception{
         lc = new LivrariaController();
     }
    
    
    
    public void setInter(InterfaceController ic){
        lc.setInter(ic);
    }
    
    public void cadastrarFuncionario(String nome, String cpf,String endereco, String telefone, String email,
            String funcao, String senha) throws Exception{
        
       
        
        lc.getInter().getInterface().getLivraria().cadastrarFuncionario(nome, cpf, endereco,
                telefone, email, funcao, senha);
        
        
    }
    
   public InterfaceController getInter(){
       return lc.getInter();
   
   }
   
    public ArrayList<String []> getFuncionarios(){
         return lc.getFuncionarios();
        
    }
    
    public Funcionario getFuncionario(String cpf){
        return lc.getInter().getInterface().getLivraria().getListaFuncionarios().get(cpf);
                
    }
    
    public String[] getFunc(String cpf){
        String [] array = new String[7];
        array[0] = lc.getInter().getInterface().getLivraria().getListaFuncionarios().get(cpf).getNome();
        array[1] = lc.getInter().getInterface().getLivraria().getListaFuncionarios().get(cpf).getCpf();
        array[2] = lc.getInter().getInterface().getLivraria().getListaFuncionarios().get(cpf).getEndereço();
        array[3] = lc.getInter().getInterface().getLivraria().getListaFuncionarios().get(cpf).getTelefone();
        array[4] = lc.getInter().getInterface().getLivraria().getListaFuncionarios().get(cpf).getEmail();
        array[5] = lc.getInter().getInterface().getLivraria().getListaFuncionarios().get(cpf).getFuncao();
        array[6] = lc.getInter().getInterface().getLivraria().getListaFuncionarios().get(cpf).getSenha();
        
        return array;
    }
    
    public void excluirFuncionario(String cpf){
        lc.excluirFuncionario(cpf);
    }
    
    public void editarFuncionario (String cpf, String nome,String endereco, String telefone, String email,
            String funcao, String senha){
        Funcionario f = lc.getInter().getInterface().getLivraria().getListaFuncionarios().get(cpf);
        f.setNome(nome);
        f.setCpf(cpf);
        f.setEmail(email);
        f.setFuncao(funcao);
        f.setSenha(senha);
        f.setEndereço(endereco);
        f.setTelefone(telefone);
        
        
        
    }
    
    
    public boolean existeFuncionarioComCpf(String cpf){
        return lc.getInter().getInterface().getLivraria().getListaFuncionarios().get(cpf) != null;
    }
   
   
    
    
}
