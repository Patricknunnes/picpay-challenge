package br.com.picpay.api.service;

import br.com.picpay.api.model.Usuario;
import br.com.picpay.api.model.dto.UsuarioDto;
import br.com.picpay.api.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAllUsers() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getUser(Long id) {
        return usuarioRepository.findById(id).orElseThrow();
    }

    @Override
    public Usuario saveUser(UsuarioDto usuarioDto) {
        return usuarioRepository.save(Usuario.builder()
                        .nomeCompleto(usuarioDto.getNomeCompleto())
                        .cpf(usuarioDto.getCpf())
                        .email(usuarioDto.getEmail())
                        .password(usuarioDto.getPassword())
                .build());
    }

    @Override
    public Usuario updateUser(Long id, UsuarioDto usuarioDto) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();

        usuario.setNomeCompleto(usuario.getNomeCompleto());
        usuario.setCpf(usuarioDto.getCpf());
        usuario.setEmail(usuarioDto.getEmail());
        usuario.setPassword(usuarioDto.getPassword());

        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteUser(Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();

        usuarioRepository.deleteById(usuario.getId());
    }
}
