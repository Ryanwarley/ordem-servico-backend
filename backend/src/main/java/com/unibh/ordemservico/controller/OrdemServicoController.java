package com.unibh.ordemservico.controller;

import com.unibh.ordemservico.dto.OrdemServicoRequest;
import jakarta.validation.Valid;
import com.unibh.ordemservico.model.OrdemServico;
import com.unibh.ordemservico.service.OrdemServicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordens")
public class OrdemServicoController {

    private final OrdemServicoService service;

    public OrdemServicoController(OrdemServicoService service) {
        this.service = service;
    }

    @PostMapping
    public OrdemServico criar(@RequestBody @Valid OrdemServicoRequest request) {
        return service.criar(request);
    }

    @GetMapping
    public List<OrdemServico> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public OrdemServico buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}/iniciar")
    public OrdemServico iniciar(@PathVariable Long id) {
        return service.iniciar(id);
    }

    @PutMapping("/{id}/finalizar")
    public OrdemServico finalizar(@PathVariable Long id) {
        return service.finalizar(id);
    }
    @PutMapping("/{id}")
    public OrdemServico atualizar(
            @PathVariable Long id,
            @RequestBody @Valid OrdemServicoRequest request) {

        return service.atualizar(id, request);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}