package com.unibh.ordemservico.model;

import com.unibh.ordemservico.enums.Prioridade;
import com.unibh.ordemservico.enums.StatusOrdemServico;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ordens_servico")
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusOrdemServico status;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    private LocalDateTime dataCriacao;

}