package com.unibh.ordemservico.repository;

import com.unibh.ordemservico.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {
}