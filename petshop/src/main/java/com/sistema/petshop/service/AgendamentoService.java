package com.sistema.petshop.service;

import com.sistema.petshop.model.Agendamento;

public interface AgendamentoService {

    Agendamento salvar(Agendamento agendamento);

    Agendamento buscarPorId(Long idAgendamento);
}