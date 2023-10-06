package br.com.joias.clienteproduto.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.joias.clienteproduto.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesId(UUID idCliente);
}
