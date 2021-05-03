/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Funcionario extends Pessoa {
	
	private String funcao;
	private String senha;

	public Funcionario(String nome, String cpf, String endereco, String telefone, String email, String funcao, String senha) {
		super(nome, cpf, endereco, telefone, email);
		this.funcao = funcao;
		this.senha = senha;
	}
	
	public String toString() {

		return "Nome: " + getNome() + "- Email: " + getEmail() + "- Endereço: " + getEndereço() + "- Telefone: "
				+ getTelefone() + "- CPF: " + getCpf()+"- Função: "+getFuncao();
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
