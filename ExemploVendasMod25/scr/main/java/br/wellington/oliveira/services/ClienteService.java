package br.wellington.oliveira.services;


import br.wellington.oliveira.dao.IClienteDAO;
import br.wellington.oliveira.domain.Cliente;
import br.wellington.oliveira.exceptions.TipoChaveNaoEncontradaException;

public class ClienteService implements IClienteservice {

	private IClienteDAO clientedao;
	
	public ClienteService(IClienteDAO clientedao) {
		
		this.clientedao = clientedao;
		
	}
	
	@Override
	public boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		
		return clientedao.cadastrar(cliente);
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		// TODO Auto-generated method stub
		return clientedao.consultar(cpf);
	}

	@Override
	public void excluirCliente(Long cpf) {
		// TODO Auto-generated method stub
		clientedao.excluir(cpf);
}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		clientedao.alterar(cliente);
		
	}
}

