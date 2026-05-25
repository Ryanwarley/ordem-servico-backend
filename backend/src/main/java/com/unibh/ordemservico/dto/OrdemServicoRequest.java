package com.unibh.ordemservico.dto;

import com.unibh.ordemservico.enums.Prioridade;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class OrdemServicoRequest {

    @NotBlank(message = "O título é obrigatório")
    @Size(min = 3, message = "O título deve ter pelo menos 3 caracteres")
    private String titulo;

    @NotBlank(message = "A descrição é obrigatória")
    @Size(min = 10, message = "A descrição deve ter pelo menos 10 caracteres")
    private String descricao;

    @NotNull(message = "A prioridade é obrigatória")
    private Prioridade prioridade;

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }
}