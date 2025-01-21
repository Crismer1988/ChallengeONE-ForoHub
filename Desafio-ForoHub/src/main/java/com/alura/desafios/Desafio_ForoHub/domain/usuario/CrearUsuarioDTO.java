package com.alura.desafios.Desafio_ForoHub.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CrearUsuarioDTO(
        @NotBlank String username,
        @NotBlank String password,
        @NotBlank String nombre,
        @NotBlank String apellido,
        @NotBlank @Email String email

) {
}