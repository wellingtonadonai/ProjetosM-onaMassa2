package br.wellington.oliveira.dao;

import br.wellington.oliveira.domain.Cliente;

public class IClienteDaoMock implements IClienteDAO {

	@Override
	public boolean salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		return true;
		
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		Cliente cliente = new Cliente();
		
		cliente.setCpf(cpf);
		return cliente; 
	}

	@Override
	public Cliente excluirCliente(Long cpf) {
		return null;
		// TODO Auto-generated method stub
		
	}



}
