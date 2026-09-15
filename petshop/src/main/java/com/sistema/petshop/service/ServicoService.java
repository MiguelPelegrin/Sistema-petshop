package com.sistema.petshop.service;

import com.sistema.petshop.model.Servico;

public interface ServicoService {

    Servico salvar(Servico servico);

    Servico buscarPorId(Long idServico);
}
