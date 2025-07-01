package br.wellington.oliveira.services;

import br.wellington.oliveira.domain.Cliente;

public interface IClienteservice {

	boolean salvar(Cliente cliente);

	Cliente buscarPorCpf(Long cpf);

	Cliente excluirCliente(Long cpf);
	

}
