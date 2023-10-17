package br.com.picpay.api.model.dto;

import lombok.Data;

@Data
public class LojistaDto {

    private String nomeCompleto;

    private String cnpj;

    private String email;

    private String password;
}
