package com.sistema.petshop.service.pet;

import com.sistema.petshop.model.Pet;
import com.sistema.petshop.repository.PetRepository;
import com.sistema.petshop.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetRepository petRepository;

    @Override
    public Pet salvar(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public Pet buscarPorId(Long idPet) {
        return petRepository.findById(idPet)
                .orElseThrow(() -> new RuntimeException("Pet não encontrado"));
    }
}
