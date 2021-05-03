/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Interface;
import Model.InterfaceProxy;

/**
 *
 * @author priscylla
 */
public class InterfaceController {
    
    private InterfaceProxy f;
        
    public InterfaceController(String usr, String senha) throws Exception{
        f = new InterfaceProxy(usr, senha);
       
        
    }

    
    
    public InterfaceProxy getInterface(){
    
        return f;
    }
    
    public void setInterface(InterfaceController interC){
        
        this.f = interC.getInterface();
        
        
        
    }
    
    public boolean validaSenha(String cpf, String senha){
        
        return (f.getLivraria().getListaFuncionarios().get(cpf).getSenha().equals(senha));     
        
    
    }
    
    public void funcionarioLogado(String cpf){
          f.setFuncionarioLogado(f.getLivraria().getListaFuncionarios().get(cpf));
    }
    
    public String getNomeFuncionario(){
        return f.getFuncionarioLogado().getNome();
    
    }
    
    
    
    
}
