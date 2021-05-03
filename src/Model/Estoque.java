/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import sun.applet.Main;

public class Estoque {
	private Map<Integer, ArrayList<Livro>> estoque;

	public Estoque() {
		estoque = new HashMap<Integer, ArrayList<Livro>>();
	}

	public void cadastrarLivro(String titulo, String autor, String editora, double valor, int codigoDoLivro) throws Exception {
            
            Livro l = new Livro(titulo, autor, editora, valor, codigoDoLivro);
		
		if (estoque.get(codigoDoLivro) == null || 
                        estoque.get(codigoDoLivro).isEmpty()) {
			ArrayList<Livro> lista = new ArrayList<Livro>();
			lista.add(l);
			estoque.put(codigoDoLivro, lista);
                                           	} 
                
                else if (equals(l, estoque.get(codigoDoLivro).get(0))) {
			estoque.get(codigoDoLivro).add(l);
                        
		} else {
			throw new Exception("Erro de Cadastro.");
		}
	}

	public boolean equals(Livro l1, Livro l2) {
		return l1.getAutor().equalsIgnoreCase(l2.getAutor()) && l1.getTitulo().equalsIgnoreCase(l2.getTitulo()) 
                        && l1.getValor()== l2.getValor() && l1.getEditora().equalsIgnoreCase(l2.getEditora());
	}

	public void editarTituloLivro(int codigoDoLivro, String titulo) {

		if (estoque.get(codigoDoLivro) != null) {
			ArrayList<Livro> l = estoque.get(codigoDoLivro);
			for (int i = 0; i < l.size(); i++) {
				l.get(i).setTitulo(titulo);
			}
		}
	}

	public void editarValorLivro(int codigoDoLivro, double valor) {
		if (estoque.get(codigoDoLivro) != null) {
			ArrayList<Livro> l = estoque.get(codigoDoLivro);
			for (int i = 0; i < l.size(); i++) {
				l.get(i).setValor(valor);
			}
		}

	}

	public void editarAutorLivro(int codigoDoLivro, String autor) {
		if (estoque.get(codigoDoLivro) != null) {
			ArrayList<Livro> l = estoque.get(codigoDoLivro);
			for (int i = 0; i < l.size(); i++) {
				l.get(i).setAutor(autor);
			}
		}

	}

	public void editarCodigoLivro(int codigoDoLivro, int novoCodigo) {
		if (estoque.get(codigoDoLivro) != null) {
			ArrayList<Livro> l = estoque.get(codigoDoLivro);
			for (int i = 0; i < l.size(); i++) {
				l.get(i).setCodigoDoLivro(novoCodigo);
			}
			estoque.remove(codigoDoLivro);
			estoque.put(novoCodigo, l);
		}
	}
        
        public void adicionarArrayLivros(ArrayList<Livro> array){
        
        
            for (int i = 0; i < array.size(); i++) {
                if(estoque.get(array.get(i).getCodigoDoLivro()) != null){
                
                    ArrayList<Livro> estq = estoque.get(array.get(i).getCodigoDoLivro());
                    estq.add(array.get(i));
                    estoque.put(array.get(i).getCodigoDoLivro(), estq);
                
                }
      
            }

        }
        
        public void adicionarArrayLivros(int cod , ArrayList<Livro> array) throws Exception{
        
            
            if (getEstoque().get(cod) == null){
        
            for (int i = 0; i < array.size(); i++) {
                cadastrarLivro(array.get(i).getTitulo(),array.get(i).getAutor(),
                        array.get(i).getEditora(), array.get(i).getValor(),
                        array.get(i).getCodigoDoLivro());
      
            }}else{
                throw new Exception ("Já existe cadastro de livros com esse Código.");
            }

        }
        
        public void excluirCodLivros(int cod){
        
            
          
            getEstoque().remove(cod);
        
        }
        
        
        public ArrayList<Livro> setCodigo(int cod,ArrayList<Livro> livros){
        
            for (int i = 0; i < livros.size(); i++) {
                
                livros.get(i).setCodigoDoLivro(cod);
                
            }
            
        
            return livros;
        }
        
        
        public void editarArrayLivros(int cod, Livro l){
        
            if(cod == l.getCodigoDoLivro()){
        
                ArrayList<Livro> livro = getEstoque().get(cod);
                
			for (int i = 0; i < livro.size(); i++) {
                            livro.get(i).setAutor(l.getAutor());
                            livro.get(i).setCodigoDoLivro(l.getCodigoDoLivro());
                            livro.get(i).setValor(l.getValor());
                            livro.get(i).setTitulo(l.getTitulo());
                            livro.get(i).setEditora(l.getEditora());
                             
			
			}
                  
                       

		}
        
        
        
        
        
        }
        
        

	public String toStringEstoque() {

		String resultado = "";

		Iterator<Integer> iterator = estoque.keySet().iterator();
		while (iterator.hasNext()) {

			int key = iterator.next();

			ArrayList<Livro> l = estoque.get(key);
			
			for (int i = 0; i < l.size(); i++) {
				resultado += l.get(i).toString() + "\n";
			}

		}

		return resultado;
	}

	public void excluirLivro(int codigoDoLivro) {
		if (estoque.get(codigoDoLivro).size()>0) {
			ArrayList<Livro> lista = estoque.get(codigoDoLivro);
			lista.remove(0);
			estoque.put(codigoDoLivro, lista);
		}
	}

	public ArrayList<Livro> getLivro(int codigoDoLivro) {
		if (estoque.get(codigoDoLivro) != null) {
			return estoque.get(codigoDoLivro);
		}
		return null;
	}

	public Map<Integer, ArrayList<Livro>> getEstoque() {
		return estoque;
	}

	public void setEstoque(Map<Integer, ArrayList<Livro>> estoque) {
		this.estoque = estoque;
	}
        
        
        

}
