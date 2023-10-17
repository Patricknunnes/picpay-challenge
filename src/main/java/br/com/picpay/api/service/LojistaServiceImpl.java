package br.com.picpay.api.service;

import br.com.picpay.api.model.Lojista;
import br.com.picpay.api.model.dto.LojistaDto;
import br.com.picpay.api.repository.LojistaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LojistaServiceImpl implements LojistaService {

    private final LojistaRepository lojistaRepository;

    @Override
    public List<Lojista> getAllSellers() {
        return lojistaRepository.findAll();
    }

    @Override
    public Lojista getSeller(Long id) {
        return lojistaRepository.findById(id).orElseThrow();
    }

    @Override
    public Lojista saveSeller(LojistaDto lojistaDto) {
        return lojistaRepository.save(Lojista.builder()
                        .nomeCompleto(lojistaDto.getNomeCompleto())
                        .cnpj(lojistaDto.getCnpj())
                        .email(lojistaDto.getEmail())
                        .password(lojistaDto.getPassword())
                .build());
    }

    @Override
    public Lojista updateSeller(LojistaDto lojistaDto, Long id) {
        Lojista lojista = lojistaRepository.findById(id).orElseThrow();

        lojista.setNomeCompleto(lojistaDto.getNomeCompleto());
        lojista.setCnpj(lojistaDto.getCnpj());
        lojista.setEmail(lojistaDto.getEmail());
        lojista.setPassword(lojistaDto.getPassword());

        return lojistaRepository.save(lojista);
    }

    @Override
    public void deleteSeller(Long id) {
        Lojista lojista = lojistaRepository.findById(id).orElseThrow();

        lojistaRepository.deleteById(lojista.getId());
    }
}
