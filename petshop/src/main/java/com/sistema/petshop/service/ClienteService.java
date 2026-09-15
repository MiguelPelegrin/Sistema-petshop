package com.sistema.petshop.service;

import com.sistema.petshop.model.Cliente;

public interface ClienteService {

    Cliente salvar(Cliente cliente);

    Cliente buscarPorId(Long idCliente);
}
