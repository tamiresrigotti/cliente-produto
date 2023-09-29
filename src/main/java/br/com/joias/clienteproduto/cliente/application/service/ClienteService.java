package br.com.joias.clienteproduto.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.joias.clienteproduto.cliente.application.api.ClienteDetalhadoResponse;
import br.com.joias.clienteproduto.cliente.application.api.ClienteListResponse;
import br.com.joias.clienteproduto.cliente.application.api.ClienteRequest;
import br.com.joias.clienteproduto.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
