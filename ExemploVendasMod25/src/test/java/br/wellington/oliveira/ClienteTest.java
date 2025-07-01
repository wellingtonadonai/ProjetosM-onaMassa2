package br.wellington.oliveira;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.wellington.oliveira.dao.IClienteDAO;
import br.wellington.oliveira.dao.IClienteDaoMock;
import br.wellington.oliveira.domain.Cliente;
import br.wellington.oliveira.services.ClienteService;
import br.wellington.oliveira.services.IClienteservice;

public class ClienteTest {
	
	private IClienteservice clienteservice;
	
	public ClienteTest() {
		IClienteDAO dao = new IClienteDaoMock();
		clienteservice = new ClienteService(dao);
	}
	
	@Test
	public void pesquisarCliente() {
		
		Cliente cliente = new Cliente();
		
		cliente.setCpf(42254521829L);
		cliente.setNome("wellington");
		cliente.setTel(992845056L);
		cliente.setEndereço("Jose lopes");
		cliente.setNumero(427);
		cliente.setCidade("Rubineia");
		cliente.setEstado("São Paulo");
		
		clienteservice.salvar(cliente);
		
		Cliente clienteConsultado = clienteservice.buscarPorCpf(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}

}
