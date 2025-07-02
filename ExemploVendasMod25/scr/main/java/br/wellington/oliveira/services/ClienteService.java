package br.wellington.oliveira.services;


import java.security.Provider.Service;

import br.wellington.oliveira.dao.IClienteDAO;
import br.wellington.oliveira.domain.Cliente;
import br.wellington.oliveira.exceptions.TipoChaveNaoEncontradaException;
import br.wellington.oliveira.services.generics.GenericService;


public class ClienteService extends GenericService<Cliente, Long> implements IClienteservice {
	
	//private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}

