package br.com.joias.clienteproduto.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.joias.clienteproduto.cliente.domain.Cliente;
import br.com.joias.clienteproduto.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private Sexo sexo;
	private String celular;
	private Boolean aceitaTermos;
	private LocalDateTime dataHoraDoCadastro;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.cpf = cliente.getCpf();
		this.email = cliente.getEmail();
		this.sexo = cliente.getSexo();
		this.celular = cliente.getCelular();
		this.aceitaTermos = cliente.getAceitaTermos();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
	}
}
