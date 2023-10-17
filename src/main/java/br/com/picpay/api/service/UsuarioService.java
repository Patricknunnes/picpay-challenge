package br.com.picpay.api.service;

import br.com.picpay.api.model.Usuario;
import br.com.picpay.api.model.dto.UsuarioDto;

import java.util.List;

public interface UsuarioService {
    List<Usuario> getAllUsers();

    Usuario getUser(Long id);

    Usuario saveUser(UsuarioDto usuarioDto);

    Usuario updateUser(Long id, UsuarioDto usuarioDto);

    void deleteUser(Long id);

}
