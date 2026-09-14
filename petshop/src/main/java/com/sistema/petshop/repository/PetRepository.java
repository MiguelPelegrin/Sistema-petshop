package com.sistema.petshop.repository;

import com.sistema.petshop.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
