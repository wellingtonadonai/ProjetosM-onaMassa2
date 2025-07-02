package br.wellington.oliveira;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import br.wellington.oliveira.dao.IClienteDAO;
import br.wellington.oliveira.dao.IClienteDaoMock;
import br.wellington.oliveira.domain.Cliente;
import br.wellington.oliveira.exceptions.TipoChaveNaoEncontradaException;
import br.wellington.oliveira.services.ClienteService;
import br.wellington.oliveira.services.IClienteservice;

public class ClienteServiceTest {
	
	private IClienteservice clienteservice;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new IClienteDaoMock();
		clienteservice = new ClienteService(dao);
	}
	
	@BeforeEach
	public void init() {
		
		cliente = new Cliente();
		
		cliente.setCpf(42254521829L);
		cliente.setNome("wellington");
		cliente.setTel(992845056L);
		cliente.setEndereço("Jose lopes");
		cliente.setNumero(427);
		cliente.setCidade("Rubineia");
		cliente.setEstado("São Paulo");
		
		
		
	}
	@Test
	public void pesquisarCliente() {
		
		Cliente clienteConsultado = clienteservice.buscarPorCpf(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
	
		boolean retorno = clienteservice.salvar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteservice.excluirCliente(cliente.getCpf());
		
	}
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("wellington");
		clienteservice.alterar(cliente);
		Assert.assertEquals("wellington", cliente.getNome());
	}
}
