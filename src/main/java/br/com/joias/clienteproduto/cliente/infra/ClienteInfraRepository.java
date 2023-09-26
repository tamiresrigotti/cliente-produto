package br.com.joias.clienteproduto.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.joias.clienteproduto.cliente.application.repository.ClienteRepository;
import br.com.joias.clienteproduto.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringDataJPARepository clienteSprintDataJPARepository;
	
	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		clienteSprintDataJPARepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}
}
