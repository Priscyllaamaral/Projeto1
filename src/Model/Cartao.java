/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;
import java.util.Date;


public class Cartao {

    private long numero;
    private String nome;
    private Date dataDeVencimento;
    private BandeiraCartao bandeira;
    private TipoVendaCartao tipo;
    
   

    public Cartao(long numero, String nome, Date dataDeVencimento, BandeiraCartao bandeira,
             TipoVendaCartao tipo) {
        this.numero = numero;
        this.nome = nome;
        this.dataDeVencimento = dataDeVencimento;
        this.bandeira = bandeira;
        this.tipo = tipo;
        
    }

    public long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    

    /**
     * @return the bandeira
     */
    public BandeiraCartao getBandeira() {
        return bandeira;
    }

    /**
     * @param bandeira the bandeira to set
     */
    public void setBandeira(BandeiraCartao bandeira) {
        this.bandeira = bandeira;
    }

    /**
     * @return the tipo
     */
    public TipoVendaCartao getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoVendaCartao tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the dataDeVencimento
     */
    public Date getDataDeVencimento() {
        return dataDeVencimento;
    }

    /**
     * @param dataDeVencimento the dataDeVencimento to set
     */
    public void setDataDeVencimento(Date dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

   

 

}
