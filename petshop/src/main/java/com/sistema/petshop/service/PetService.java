package com.sistema.petshop.service;

import com.sistema.petshop.model.Pet;

public interface PetService {

    Pet salvar(Pet pet);

    Pet buscarPorId(Long idPet);
}
