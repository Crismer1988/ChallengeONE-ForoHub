package com.alura.desafios.Desafio_ForoHub.domain.respuesta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CrearRespuestaDTO(
        @NotBlank String mensaje,
        @NotNull Long usuarioId,
        @NotNull long topicoId
) {
}
