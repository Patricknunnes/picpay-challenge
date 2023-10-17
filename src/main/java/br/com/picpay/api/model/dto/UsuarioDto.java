package br.com.picpay.api.model.dto;

import lombok.Data;

@Data
public class UsuarioDto {

    private String nomeCompleto;

    private String cpf;

    private String email;

    private String password;
}
