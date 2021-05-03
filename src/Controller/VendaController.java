/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Model.FormaDePagamento;
import Model.Livro;
import Model.Venda;
import Model.VendaCartao;
import java.text.DateFormat;
import java.util.ArrayList;
import sun.text.resources.FormatData;

/**
 *
 * @author priscylla
 */
public class VendaController {
    
    private LivrariaController lc;
    
    public VendaController() throws Exception{
        lc = new LivrariaController();
    }
    
    public void setInter(InterfaceController ic){
        lc.setInter(ic);
    }
    
    
    
   public InterfaceController getInter(){
       return lc.getInter();
   
   }
   
   
   public ArrayList<String []> getVendas(){
       return lc.getVendas();
   }
   
   public Venda getVenda(int codigo){
       return lc.getVenda(codigo);
   }
   
   public FormaDePagamento getFormaDePagamento(int codigo){
      return lc.getInter().getInterface().getLivraria().getListaVendas().get(codigo).getFormaDePagamento();
       
   }
    
   public int getTamArrayLivros(int cod){
        return lc.getInter().getInterface().getLivraria().getEstoque().getEstoque().get(cod).size();
                   }
   
   public ArrayList<Livro> getArrayLivros(int cod){
        return lc.getInter().getInterface().getLivraria().getEstoque().getEstoque().get(cod);
                   }
   
   public void excluirLivro(int cod){
       lc.getInter().getInterface().getLivraria().getEstoque().excluirLivro(cod);
   }
   
   public Cliente getCliente(String cpf){
       return lc.getInter().getInterface().getLivraria().getListaClientes().get(cpf);
   }
   
   public void adicionarArrayLivros(ArrayList<Livro> array){
       lc.getInter().getInterface().getLivraria().getEstoque().adicionarArrayLivros(array);
   }
   
   public int geraCodigo(){
       return lc.getInter().getInterface().getLivraria().geraCodigo();
   }
   
   public void efetuarVenda(Venda v){
       lc.getInter().getInterface().getLivraria().efetuarVenda(v);
   }
   
   public String[] getArrayVenda(int codigo){
       Venda v = lc.getInter().getInterface().getLivraria().getListaVendas().get(codigo);
       return null;
   }
   
   
   public Object[] getVendaDinheiro(int cod){
       DateFormat formataData = DateFormat.getDateInstance();
       Object [] venda = new Object[6];
       Venda v = lc.getInter().getInterface().getLivraria().getListaVendas().get(cod);
       if(v.getCliente() != null){
       venda[0] = v.getCliente().getNome();}
       else{
           venda[0] = "null";
       }
       venda[1] = v.getCodVenda();
       venda[2] = formataData.format(v.getData());
       venda[3] = Double.toString(v.getValorTotalDaVenda());
       venda[4] = v.getFormaDePagamento().toString();
  
    ArrayList<Livro> array = v.getLivrosDaVenda();
    ArrayList<String[]> array2 = new ArrayList<String[]>();
    
       for (int i = 0; i < array.size(); i++) {
           String [] livro = new String[2];
           livro[0] = Integer.toString(array.get(i).getCodigoDoLivro());
           livro[1] = array.get(i).getTitulo();
           array2.add(livro);
       }
       venda[5] = array2;
    
    

 return venda;   
 
   }
   
   public String [] getCartao(int cod){
       String[] array = new String [4];
       DateFormat formataData = DateFormat.getDateInstance();
       VendaCartao vc = (VendaCartao)lc.getInter().getInterface().getLivraria().getListaVendas().get(cod);
       
       if(!vc.getCartao().getNome().equals("")){
       array[0] = vc.getCartao().getNome();}
       else{
       array[0] = "null";
       }
       array[1] = Long.toString(vc.getCartao().getNumero());
       array[2] = formataData.format(vc.getCartao().getDataDeVencimento());
       array[3] = vc.getCartao().getBandeira().toString();
   
   
       return array;
   }

   
   public Object[] getVendaCartao(int cod){
       DateFormat formataData = DateFormat.getDateInstance();
       Object [] venda = new Object[9];
       VendaCartao v = (VendaCartao)lc.getInter().getInterface().getLivraria().getListaVendas().get(cod);
       if(v.getCliente() != null){
       venda[0] = v.getCliente().getNome();}
       else{
           venda[0] = "null";
       }
       venda[1] = v.getCodVenda();
       venda[2] = formataData.format(v.getData());
       venda[3] = Double.toString(v.getValorTotalDaVenda());
       venda[4] = v.getFormaDePagamento().toString();
        venda[5] = Integer.toString(v.getParcelas());
        venda[6] = getCartao(cod);
        
      
      
    ArrayList<Livro> array = v.getLivrosDaVenda();
    ArrayList<String[]> array2 = new ArrayList<String[]>();
    
       for (int i = 0; i < array.size(); i++) {
           String [] livro = new String[2];
           livro[0] = Integer.toString(array.get(i).getCodigoDoLivro());
           livro[1] = array.get(i).getTitulo();
           array2.add(livro);
       }
       venda[7] = array2;
       venda[8] = v.getCartao().getTipo();
    
    

 return venda;   
}
   
   
}

