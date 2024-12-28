package com.microservicio.usuario.controller;


import com.microservicio.usuario.entity.Usuario;
import com.microservicio.usuario.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {


    @Autowired
    private UsuarioServices usuarioServices;

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioNuevo = usuarioServices.saveUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioNuevo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable String id) {
        Usuario usuario = usuarioServices.getUsuario(id);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        List<Usuario> usuarios = usuarioServices.getAllUsuarios();
        return ResponseEntity.ok(usuarios);
    }

}
