package br.com.joias.clienteproduto.cliente.application.repository;

import java.util.List;

import br.com.joias.clienteproduto.cliente.application.api.ClienteListResponse;
import br.com.joias.clienteproduto.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);

	List<Cliente> buscaTodosClientes();
}
