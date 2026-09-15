package com.sistema.petshop.controller;

import com.sistema.petshop.model.Pet;
import com.sistema.petshop.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping
    public ResponseEntity<Pet> salvar (@RequestBody Pet pet ){
        Pet petSalvo = petService.salvar(pet);

        return ResponseEntity.ok(petSalvo);
    }

    @GetMapping("/{idPet}")
    public ResponseEntity<Pet> buscarPorId(@PathVariable Long idPet){
        Pet pet = petService.buscarPorId(idPet);

        return ResponseEntity.ok(pet);
    }

}
