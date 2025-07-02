package br.wellington.oliveira.dao;

import br.wellington.oliveira.domain.Cliente;

public class ClienteDAO implements IClienteDAO {



	@Override
	public boolean salvar(Cliente cliente) {
		return true;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente excluirCliente(Long cpf) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object alterar(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
