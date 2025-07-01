package br.wellington.oliveira.dao;

import br.wellington.oliveira.domain.Cliente;

public class IClienteDaoMock implements IClienteDAO {

	@Override
	public void salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		Cliente cliente = new Cliente();
		
		cliente.setCpf(cpf);
		return cliente; 
	}



}
