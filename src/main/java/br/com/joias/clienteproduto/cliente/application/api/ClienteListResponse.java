package br.com.joias.clienteproduto.cliente.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import br.com.joias.clienteproduto.cliente.domain.Cliente;

public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return null;
	}
}
