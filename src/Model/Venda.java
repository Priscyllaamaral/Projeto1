/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.util.ArrayList;
import java.util.Date;

public interface Venda {

      public void setCodVenda(int i);
           
         
      public int getCodVenda();
        
        
        
	
	public void adicionarLivro(Livro l);

	

        public Date getData();
        
        
	
        
        public void setData(Date data);

	public ArrayList<Livro> getLivrosDaVenda();

	public void setLivrosDaVenda(ArrayList<Livro> livrosDaVenda);
	public double getValorTotalDaVenda();

	public void setValorTotalDaVenda(double valorTotalDaVenda);
	public FormaDePagamento getFormaDePagamento();

	public void setFormaDePagamento(FormaDePagamento formaDePagamento);

	public Cliente getCliente();
	public void setCliente(Cliente cliente);
	
	
	
	
	
	
	
	
	
	

}

