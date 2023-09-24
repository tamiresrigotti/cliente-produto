package br.com.joias.clienteproduto.cliente.application.service;

import br.com.joias.clienteproduto.cliente.application.api.ClienteRequest;
import br.com.joias.clienteproduto.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
