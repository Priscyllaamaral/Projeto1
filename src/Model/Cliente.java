/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Cliente extends Pessoa {

	public Cliente(String nome, String cpf, String endereco, String telefone, String email) {
		super(nome, cpf, endereco, telefone, email);

	}

	public String toString() {

		return " Nome: " + getNome() + "\n Email: " + getEmail() + "\n Endereço: " + 
                        getEndereço() + "\n Telefone: "
				+ getTelefone() + "\n CPF: " + getCpf();

	}
}
