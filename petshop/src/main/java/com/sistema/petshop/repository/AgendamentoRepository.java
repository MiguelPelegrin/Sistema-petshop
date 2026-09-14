package com.sistema.petshop.repository;

import com.sistema.petshop.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{

    boolean existsByDataAgendamentoAndHorario (
            LocalDate dataAgendamento, //Pego no model
            LocalTime horario //Pego no model
    );
}
