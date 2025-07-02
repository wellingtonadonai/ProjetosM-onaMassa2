package br.wellington.oliveira.services;


import br.wellington.oliveira.dao.IClienteDAO;
import br.wellington.oliveira.domain.Cliente;

public class ClienteService implements IClienteservice {

	private IClienteDAO clientedao;
	
	public ClienteService(IClienteDAO clientedao) {
		
		this.clientedao = clientedao;
		
	}
	
	@Override
	public boolean salvar(Cliente cliente) {
		
		return clientedao.salvar(cliente);
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		// TODO Auto-generated method stub
		return clientedao.buscarPorCpf(cpf);
	}

	@Override
	public Cliente excluirCliente(Long cpf) {
		// TODO Auto-generated method stub
		return clientedao.excluirCliente(cpf);
}

	@Override
	public void alterar(Cliente cliente) {
		clientedao.alterar(cliente);
		
	}
}

