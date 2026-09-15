package com.sistema.petshop.service.servico;

import com.sistema.petshop.model.Servico;
import com.sistema.petshop.repository.ServicoRepository;
import com.sistema.petshop.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServeicoServiceImpl implements ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    @Override
    public Servico salvar(Servico servico) {
        return servicoRepository.save(servico);
    }

    @Override
    public Servico buscarPorId(Long idServico) {
        return servicoRepository.findById(idServico)
                .orElseThrow(() -> new RuntimeException("Serviço não encontrado"));
    }
}
