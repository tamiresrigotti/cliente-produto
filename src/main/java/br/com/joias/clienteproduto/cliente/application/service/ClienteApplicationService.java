package br.com.joias.clienteproduto.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.joias.clienteproduto.cliente.application.api.ClienteRequest;
import br.com.joias.clienteproduto.cliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return null;
	}

}
