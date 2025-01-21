package com.alura.desafios.Desafio_ForoHub.domain.curso;


import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

public record CrearCursoDTO(@NotBlank String name, @NotNull Categoria categoria) {
}