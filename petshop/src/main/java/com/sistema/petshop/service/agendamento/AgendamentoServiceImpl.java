package com.sistema.petshop.service.agendamento;

import com.sistema.petshop.model.Agendamento;
import com.sistema.petshop.repository.AgendamentoRepository;
import com.sistema.petshop.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoServiceImpl implements AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;


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

    @Override
    public Agendamento buscarPorId(Long idAgendamento) {
        return agendamentoRepository.findById(idAgendamento)
                .orElseThrow(() -> new RuntimeException("Agendamento não encontrado"));
    }

}