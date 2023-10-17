package br.com.picpay.api.controller;

import br.com.picpay.api.model.Usuario;
import br.com.picpay.api.model.dto.UsuarioDto;
import br.com.picpay.api.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsers() {
        return usuarioService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Usuario getUser(@PathVariable Long id) {
        return usuarioService.getUser(id);
    }

    @PostMapping
    public Usuario saveUser(@RequestBody UsuarioDto usuarioDto) {
        return usuarioService.saveUser(usuarioDto);
    }

    @PutMapping("/{id}")
    public Usuario updateUser(@RequestBody UsuarioDto usuarioDto, @PathVariable Long id) {
        return usuarioService.updateUser(id, usuarioDto);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        usuarioService.deleteUser(id);
    }
}
