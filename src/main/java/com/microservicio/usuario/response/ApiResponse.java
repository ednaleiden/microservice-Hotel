package com.microservicio.usuario.response;

import lombok.*;
import org.springframework.http.HttpStatus;
import lombok.Builder;

@Getter
@Setter
@Builder
public class ApiResponse {

    private String message;

    private boolean success;

    private HttpStatus status;


    // Constructor con todos los parámetros
    public ApiResponse(String message, boolean success, HttpStatus status) {
        this.message = message;
        this.success = success;
        this.status = status;
    }

    // Constructor sin parámetros (necesario para algunas herramientas o marcos)
    public ApiResponse() {}

    // Getters
    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }

    public HttpStatus getStatus() {
        return status;
    }

    // Setters
    public void setMessage(String message) {
        this.message = message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    // Método builder() manual
    public static ApiResponseBuilder builder() {
        return new ApiResponseBuilder();
    }

    // Clase estática Builder para construir objetos de ApiResponse
    public static class ApiResponseBuilder {
        private String message;
        private boolean success;
        private HttpStatus status;

        public ApiResponseBuilder message(String message) {
            this.message = message;
            return this;
        }

        public ApiResponseBuilder success(boolean success) {
            this.success = success;
            return this;
        }

        public ApiResponseBuilder status(HttpStatus status) {
            this.status = status;
            return this;
        }

        public ApiResponse build() {
            return new ApiResponse(message, success, status);
        }
    }



}