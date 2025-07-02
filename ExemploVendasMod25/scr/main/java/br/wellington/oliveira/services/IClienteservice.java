package br.wellington.oliveira.services;

import br.wellington.oliveira.domain.Cliente;
import br.wellington.oliveira.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteservice {

	boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCpf(Long cpf);

	void excluirCliente(Long cpf);

	void alterar(Cliente cliente)throws TipoChaveNaoEncontradaException;

	
	

}
