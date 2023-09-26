package br.com.joias.clienteproduto.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.joias.clienteproduto.cliente.application.repository.ClienteRepository;
import br.com.joias.clienteproduto.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		clienteSprintDataJPA
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}
}
