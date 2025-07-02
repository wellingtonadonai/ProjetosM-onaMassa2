package br.wellington.oliveira;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import br.wellington.oliveira.dao.IClienteDAO;
import br.wellington.oliveira.dao.IClienteDaoMock;
import br.wellington.oliveira.domain.Cliente;
import br.wellington.oliveira.exceptions.TipoChaveNaoEncontradaException;
import br.wellington.oliveira.services.ClienteService;
import br.wellington.oliveira.services.IClienteservice;

public class ClienteServiceTest {
	
	private IClienteservice clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new IClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEndereço("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.salvar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluirCliente(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Rodrigo Pires");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Rodrigo Pires", cliente.getNome());
	}
}