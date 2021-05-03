/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Livro {
	
	private String titulo;
	private String autor;
	private double valor;
	private int codigoDoLivro;
        private String editora;
	
	public Livro(String titulo, String autor, String editora, double valor, int codigoDoLivro) {
		this.titulo = titulo;
		this.autor = autor;
		this.valor = valor;
		this.codigoDoLivro = codigoDoLivro;
                this.editora = editora;
                
                
	}
	
	public String toString() {
		
		
		return " Titulo "+getTitulo()+"- Autor "+getAutor()+"- Valor R$"+getValor()+"- Código "+getCodigoDoLivro();
	}
        
        public void setEditora(String editora){
            this.editora = editora;
        }

        public String getEditora(){
            return editora;
        }
        
        
        
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCodigoDoLivro() {
		return codigoDoLivro;
	}

	public void setCodigoDoLivro(int codigoDoLivro) {
		this.codigoDoLivro = codigoDoLivro;
	}

}
