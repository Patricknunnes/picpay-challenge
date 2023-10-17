package br.com.picpay.api.repository;

import br.com.picpay.api.model.Lojista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LojistaRepository extends JpaRepository<Lojista, Long> {
}
