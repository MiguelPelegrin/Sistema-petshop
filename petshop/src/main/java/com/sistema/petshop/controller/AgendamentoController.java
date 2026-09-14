package com.sistema.petshop.controller;

import com.sistema.petshop.model.Agendamento;
import com.sistema.petshop.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<Agendamento> salvar(
            @RequestBody Agendamento agendamento) {

        Agendamento agendamentoSalvo =
                agendamentoService.salvar(agendamento);

        return ResponseEntity.ok(agendamentoSalvo);
    }
}