package com.microservicio.usuario.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException() {
        super("Recurso no encontrado en el servidor");
    }
}
