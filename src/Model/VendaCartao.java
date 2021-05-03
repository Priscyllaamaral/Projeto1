/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author priscylla
 */
public class VendaCartao implements Venda {
    
    private Cartao cartao;
    private int parcelas;
    private ArrayList<Livro> livrosDaVenda;
    private double valorTotalDaVenda;
    private FormaDePagamento formaDePagamento;
    private Cliente cliente;
    private Date data;
    private int codigo;
    
    public VendaCartao(int codigo, FormaDePagamento forma, Cliente cliente, Double valor, 
            ArrayList<Livro> array, Date data, Cartao cartao, int parcelas) {
       
        
        this.cartao = cartao;
        this.parcelas = parcelas;
        livrosDaVenda = array;
        valorTotalDaVenda = valor;
        this.cliente = cliente;
        formaDePagamento = forma;
        this.data= data;
        this.codigo = codigo;
         
    }

    /**
     * @return the cartao
     */
    public Cartao getCartao() {
        return cartao;
    }

    /**
     * @param cartao the cartao to set
     */
    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    /**
     * @return the parcelas
     */
    public int getParcelas() {
        return parcelas;
    }

    /**
     * @param parcelas the parcelas to set
     */
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    
    public void setCodVenda(int i){
            codigo = i;
        }
            
         
         public int getCodVenda(){
         
             return codigo;
        }
        
        
        
        
	
	public void adicionarLivro(Livro l) {
		//só podem ser adicionados livros que estejam no estoque
		livrosDaVenda.add(l);
		valorTotalDaVenda+=l.getValor();
	}

	

        public Date getData(){
            return data;
        }
        
        
	
        
        public void setData(Date data){
            this.data = data;
        }

	public ArrayList<Livro> getLivrosDaVenda() {
		return livrosDaVenda;
	}

	public void setLivrosDaVenda(ArrayList<Livro> livrosDaVenda) {
		this.livrosDaVenda = livrosDaVenda;
	}

	public double getValorTotalDaVenda() {
		return valorTotalDaVenda;
	}

	public void setValorTotalDaVenda(double valorTotalDaVenda) {
		this.valorTotalDaVenda = valorTotalDaVenda;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}