package com.sistema.petshop.service.cliente;

import com.sistema.petshop.model.Cliente;
import com.sistema.petshop.repository.ClienteRepository;
import com.sistema.petshop.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente buscarPorId(Long idCliente) {
        return clienteRepository.findById(idCliente)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }
}
