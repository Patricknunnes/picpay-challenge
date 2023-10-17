package br.com.picpay.api.service;

import br.com.picpay.api.model.Lojista;
import br.com.picpay.api.model.dto.LojistaDto;

import java.util.List;

public interface LojistaService {
    List<Lojista> getAllSellers();

    Lojista getSeller(Long id);

    Lojista saveSeller(LojistaDto lojistaDto);

    Lojista updateSeller(LojistaDto lojistaDto, Long id);

    void deleteSeller(Long id);
}
