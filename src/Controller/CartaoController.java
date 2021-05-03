/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;

/**
 *
 * @author priscylla
 */
public class CartaoController {
    
    private LivrariaController lc;
    
    public CartaoController() throws Exception{
        lc = new LivrariaController();
    
    }
    
     public void setInter(InterfaceController ic){
        lc.setInter(ic);
    }
    
    
    
    
    public InterfaceController getInter(){
        return lc.getInter();
    }
    
    
}
