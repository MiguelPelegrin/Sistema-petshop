package com.sistema.petshop.controller;

import com.sistema.petshop.model.Servico;
import com.sistema.petshop.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @PostMapping
    public ResponseEntity<Servico> salvar(@RequestBody Servico servico){
        Servico servicoSalvo = servicoService.salvar(servico);

        return ResponseEntity.ok(servico);
    }

    @GetMapping("/{idServico}")
    public ResponseEntity<Servico> buscarPorId(@PathVariable Long idServico){
        Servico servico = servicoService.buscarPorId(idServico);

        return ResponseEntity.ok(servico);

    }

}
