package br.wellington.oliveira.dao;

import br.wellington.oliveira.domain.Cliente;

public interface IClienteDAO {

	boolean salvar(Cliente cliente);
	
	Cliente buscarPorCpf(Long cpf);

	Cliente excluirCliente(Long cpf);

	Object alterar(Cliente cliente);



	
}
