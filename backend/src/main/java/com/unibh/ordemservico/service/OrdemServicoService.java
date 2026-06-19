package com.unibh.ordemservico.service;

import com.unibh.ordemservico.dto.OrdemServicoRequest;
import com.unibh.ordemservico.enums.StatusOrdemServico;
import com.unibh.ordemservico.model.OrdemServico;
import com.unibh.ordemservico.repository.OrdemServicoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrdemServicoService {

    private final OrdemServicoRepository repository;

    public OrdemServicoService(OrdemServicoRepository repository) {
        this.repository = repository;
    }

    public OrdemServico criar(OrdemServicoRequest request) {
        OrdemServico ordemServico = new OrdemServico();

        ordemServico.setTitulo(request.getTitulo());
        ordemServico.setDescricao(request.getDescricao());
        ordemServico.setPrioridade(request.getPrioridade());
        ordemServico.setStatus(StatusOrdemServico.ABERTA);
        ordemServico.setDataCriacao(LocalDateTime.now());

        


        return repository.save(ordemServico);
    }

    public List<OrdemServico> listar() {
        return repository.findAll();
    }

    public OrdemServico buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ordem de serviço não encontrada"));
    }

    public OrdemServico iniciar(Long id) {
        OrdemServico ordemServico = buscarPorId(id);
        ordemServico.setStatus(StatusOrdemServico.EM_ANDAMENTO);
        return repository.save(ordemServico);
    }

    public OrdemServico finalizar(Long id) {
        OrdemServico ordemServico = buscarPorId(id);
        ordemServico.setStatus(StatusOrdemServico.FINALIZADA);
        return repository.save(ordemServico);
    }
    public OrdemServico atualizar(Long id, OrdemServicoRequest request) {

        OrdemServico ordemServico = buscarPorId(id);

        ordemServico.setTitulo(request.getTitulo());
        ordemServico.setDescricao(request.getDescricao());
        ordemServico.setPrioridade(request.getPrioridade());

        return repository.save(ordemServico);
    }
    public void deletar(Long id) {

        OrdemServico ordemServico = buscarPorId(id);

        @NotBlank(message = "O título é obrigatório")
        private String titulo;


        @NotBlank(message = "A descrição é obrigatória")
         private String descricao;

        repository.delete(ordemServico);
    }
}
