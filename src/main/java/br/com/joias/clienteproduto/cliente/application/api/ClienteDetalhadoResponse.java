package br.com.joias.clienteproduto.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

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
	private LocalDate dataHoraDoCadastro;	
}
