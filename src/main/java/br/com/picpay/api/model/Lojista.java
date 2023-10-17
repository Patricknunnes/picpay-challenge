package br.com.picpay.api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_lojista")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Lojista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_completo")
    private String nomeCompleto;

    @Column(name = "cnpj", unique = true)
    private String cnpj;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

}
