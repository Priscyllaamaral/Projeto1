/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author priscylla
 */
public class InterfaceProxy extends Interface{
    
    private String usuario;
    private String senha;
   
   
    
    public InterfaceProxy(String usr, String senha)throws Exception{
        usuario = usr;
        this.senha = senha;
       // super.inicializaLivraria();
       
      
        
    
    
    }
    @Override
    public Livraria getLivraria() {
        
        if(temPermissaoDeAcesso()){
		return super.getLivraria();
	}
        return null;
    }

    @Override
	public void setLivraria(Livraria livraria) {
            if(temPermissaoDeAcesso()){
                super.setLivraria(livraria);
            }
	}

    @Override
	public Funcionario getFuncionarioLogado() {
            if(temPermissaoDeAcesso()){
		return super.getFuncionarioLogado();
	}
            return null;
                 
        }

    @Override
	public void setFuncionarioLogado(Funcionario funcionarioLogado) {
            if(temPermissaoDeAcesso()){
	        super.setFuncionarioLogado(funcionarioLogado);
	}}
    
   
    
    public boolean temPermissaoDeAcesso(){
        return super.login(getUsuario(), getSenha());
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
  
    
   
    
    
    
}
