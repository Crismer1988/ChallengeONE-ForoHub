package com.alura.desafios.Desafio_ForoHub.domain.respuesta.validaciones.actualizar;

import com.alura.desafios.Desafio_ForoHub.domain.respuesta.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    public void validate(ActualizarRespuestaDTO data, Long respuestaId);

}