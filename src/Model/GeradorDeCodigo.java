/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author priscylla
 */
public class GeradorDeCodigo {
    private static int ID = 1;

    public static int getProximoCodigo() {
        return ID++;
    }
    
    
    
    
    
}
