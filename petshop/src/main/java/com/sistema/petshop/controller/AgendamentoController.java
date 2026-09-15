package com.sistema.petshop.controller;

import com.sistema.petshop.model.Agendamento;
import com.sistema.petshop.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{idAgendamento}")
    public ResponseEntity<Agendamento> buscarPorId(@PathVariable Long idAgendamento){
        Agendamento agendamento = agendamentoService.buscarPorId(idAgendamento);

        return ResponseEntity.ok(agendamento);
    }
}