package br.com.joias.clienteproduto.cliente.application.repository;

import br.com.joias.clienteproduto.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}
