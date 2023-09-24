package br.com.joias.clienteproduto.cliente.application.api;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.joias.clienteproduto.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteRequest {

	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	@CPF
	private String cpf;
	@NotNull
	private Boolean aceitaTermos;
}
