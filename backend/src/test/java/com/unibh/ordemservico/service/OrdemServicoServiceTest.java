package com.unibh.ordemservico.service;

import com.unibh.ordemservico.dto.OrdemServicoRequest;
import com.unibh.ordemservico.enums.Prioridade;
import com.unibh.ordemservico.enums.StatusOrdemServico;
import com.unibh.ordemservico.model.OrdemServico;
import com.unibh.ordemservico.repository.OrdemServicoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OrdemServicoServiceTest {

    @Test
    void deveCriarOrdemServicoComStatusAberta() {
        OrdemServicoRepository repository = Mockito.mock(OrdemServicoRepository.class);
        OrdemServicoService service = new OrdemServicoService(repository);

        OrdemServicoRequest request = new OrdemServicoRequest();

        try {
            var tituloField = OrdemServicoRequest.class.getDeclaredField("titulo");
            tituloField.setAccessible(true);
            tituloField.set(request, "Troca de cabo");

            var descricaoField = OrdemServicoRequest.class.getDeclaredField("descricao");
            descricaoField.setAccessible(true);
            descricaoField.set(request, "Cliente sem internet");

            var prioridadeField = OrdemServicoRequest.class.getDeclaredField("prioridade");
            prioridadeField.setAccessible(true);
            prioridadeField.set(request, Prioridade.ALTA);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Mockito.when(repository.save(Mockito.any(OrdemServico.class)))
                .thenAnswer(invocation -> invocation.getArgument(0));

        OrdemServico ordemServico = service.criar(request);

        Assertions.assertEquals(StatusOrdemServico.ABERTA, ordemServico.getStatus());
    }
}