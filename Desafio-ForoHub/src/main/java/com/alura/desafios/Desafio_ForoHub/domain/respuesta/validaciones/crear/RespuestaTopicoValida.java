package com.alura.desafios.Desafio_ForoHub.domain.respuesta.validaciones.crear;

import com.alura.desafios.Desafio_ForoHub.domain.respuesta.CrearRespuestaDTO;
import com.alura.desafios.Desafio_ForoHub.domain.topico.Estado;
import com.alura.desafios.Desafio_ForoHub.domain.topico.TopicoRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RespuestaTopicoValida implements ValidarRespuestaCreada {

    @Autowired
    private TopicoRepository repository;

    @Override
    public void validate(CrearRespuestaDTO data) {
        var topicoExiste = repository.existsById(data.topicoId());

        if (!topicoExiste){
            throw new ValidationException("Este topico no existe.");
        }

        var topicoAbierto = repository.findById(data.topicoId()).get().getEstado();

        if(topicoAbierto != Estado.OPEN){
            throw new ValidationException("Este topico no esta abierto.");
        }

    }
}
