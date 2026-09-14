package com.sistema.petshop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import com.sistema.petshop.model.enums.Porte;

@Entity
@Table(name = "pets")
@Getter
@Setter
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet")
    private Long idPet;

    @NotBlank
    @Column(name = "nome_pet")
    private String nomePet;

    private String raca;

    @Enumerated(EnumType.STRING)
    private Porte porte;

    private Long idade;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;
}