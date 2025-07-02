package br.wellington.oliveira;



import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.wellington.oliveira.dao.IClienteDAO;
import br.wellington.oliveira.dao.IClienteDaoMock;
import br.wellington.oliveira.domain.Cliente;
import br.wellington.oliveira.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAOTest {
	private IClienteDAO clientedao;
	private Cliente cliente;
	
	
	public ClienteDAOTest() {
		
		clientedao = new IClienteDaoMock();
		
	}
	@BeforeEach
	public void init() throws TipoChaveNaoEncontradaException {
		
		cliente = new Cliente();
		
		cliente.setCpf(42254521829L);
		cliente.setNome("wellington");
		cliente.setTel(992845056L);
		cliente.setEndereço("Jose lopes");
		cliente.setNumero(427);
		cliente.setCidade("Rubineia");
		cliente.setEstado("São Paulo");
		
		clientedao.cadastrar(cliente);
		
	}
	@Test
	public void pesquisarCliente() {
		
		
		Cliente clienteConsultado = clientedao.consultar(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		
		 Boolean retorno = clientedao.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}

	
	@Test
	public void excluirCliente() {
		
		clientedao.excluir(cliente.getCpf());
		
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		
		clientedao.alterar(cliente);
		
	}
	
	
	
	
	

}
