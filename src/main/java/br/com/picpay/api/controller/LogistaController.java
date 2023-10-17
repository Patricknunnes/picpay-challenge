package br.com.picpay.api.controller;

import br.com.picpay.api.model.Lojista;
import br.com.picpay.api.model.dto.LojistaDto;
import br.com.picpay.api.service.LojistaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sellers")
@RequiredArgsConstructor
public class LogistaController {

    private final LojistaService lojistaService;

    @GetMapping
    public List<Lojista> getAllSeller() {
        return lojistaService.getAllSellers();
    }

    @GetMapping("/{id}")
    public Lojista getSeller(@PathVariable Long id) {
        return lojistaService.getSeller(id);
    }

    @PostMapping
    public Lojista saveSeller(@RequestBody LojistaDto lojistaDto) {
        return lojistaService.saveSeller(lojistaDto);
    }

    @PutMapping("/{id}")
    public Lojista updateSeller(@RequestBody LojistaDto lojistaDto, @PathVariable Long id) {
        return lojistaService.updateSeller(lojistaDto, id);
    }

    @DeleteMapping("/{id}")
    public void deleteSeller(@PathVariable Long id) {
        lojistaService.deleteSeller(id);
    }
}
