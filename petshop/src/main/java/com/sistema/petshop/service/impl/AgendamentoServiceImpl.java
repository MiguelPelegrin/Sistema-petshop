package com.sistema.petshop.service.impl;

import com.sistema.petshop.model.Agendamento;
import com.sistema.petshop.repository.AgendamentoRepository;
import com.sistema.petshop.service.AgendamentoService;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoServiceImpl implements AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public AgendamentoServiceImpl(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    @Override
    public Agendamento salvar(Agendamento agendamento) {

        boolean horarioOcupado =
                agendamentoRepository.existsByDataAgendamentoAndHorario(
                        agendamento.getDataAgendamento(),
                        agendamento.getHorario()
                );

        if (horarioOcupado) {
            throw new RuntimeException("Horário já está ocupado!");
        }

        return agendamentoRepository.save(agendamento);
    }
}