package com.sistema.petshop.controller;

import com.sistema.petshop.model.Cliente;
import com.sistema.petshop.service.ClienteService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> salvar (@RequestBody Cliente cliente){

        Cliente clienteSalvo = clienteService.salvar(cliente);

        return ResponseEntity.ok(clienteSalvo);
    }

    @GetMapping("/{idCliente}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long idCliente){
        Cliente cliente = clienteService.buscarPorId(idCliente);

        return ResponseEntity.ok(cliente);
    }


}
