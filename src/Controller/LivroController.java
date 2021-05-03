/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Livro;
import java.util.ArrayList;

/**
 *
 * @author priscylla
 */
public class LivroController {
    
    private LivrariaController lc;
    
    public LivroController() throws Exception{
        lc = new LivrariaController();
    }
    
    
    
    public void setInter(InterfaceController ic){
        lc.setInter(ic);
    }
    
    public void cadastrarLivro(String titulo, String autor, String editora, double valor,
           int codigo) throws Exception{
    
        
        lc.cadastrarLivro(titulo, autor, editora, valor, codigo);
        
        
        
        
    }
    
   public InterfaceController getInter(){
       return lc.getInter();
   
   }
   
   public ArrayList<String []> getLivros(){
    return lc.getLivros();
   }
   
   public ArrayList<Livro> getLivro(int codigo){
      return lc.getInter().getInterface().getLivraria().getEstoque().getLivro(codigo);
   }
   
   public ArrayList<Livro> setCodigo(int cod, ArrayList<Livro> livros){
       return lc.getInter().getInterface().getLivraria().getEstoque().setCodigo(cod, livros);
       
   }
   
   public void adicionarArrayLivros(int cod, ArrayList<Livro> novosLivros) throws Exception{
       lc.getInter().getInterface().getLivraria().getEstoque().adicionarArrayLivros(cod, novosLivros);
   }
   
   public void excluirCodigoLivro(int codigo){
        lc.getInter().getInterface().getLivraria().getEstoque().excluirCodLivros(codigo);
   }
   
   public void editarArrayLivros(int cod, String titulo, String autor, String editora, Double valor){
       Livro novo = new Livro(titulo, autor, editora, valor, cod);
        lc.getInter().getInterface().getLivraria().getEstoque().editarArrayLivros(cod, novo);
       
   }
   
   public String[] getLivro2(int codigo){
       Livro l = lc.getInter().getInterface().getLivraria().getEstoque().getLivro(codigo).get(0);
       String[] livro = new String [5];
       livro[0] = l.getTitulo();
       livro[1] = l.getAutor();
       livro[2] = Double.toString(l.getValor());
       livro[3] = Integer.toString(l.getCodigoDoLivro());
       livro[4] = l.getEditora();
       
       
       return livro;
   }
    
   public boolean existeLivro(int cod){
       return lc.getInter().getInterface().getLivraria().getEstoque().getLivro(cod) != null;
   }
    
   
   public void editarCodigoDoLivro(int cod, int codigo){
       lc.getInter().getInterface().getLivraria().getEstoque().editarCodigoLivro(cod, codigo);
   }
}
