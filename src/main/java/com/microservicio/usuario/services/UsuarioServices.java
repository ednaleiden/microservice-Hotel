package com.microservicio.usuario.services;

import com.microservicio.usuario.entity.Usuario;

import java.util.List;

public interface UsuarioServices {

    Usuario saveUsuario(Usuario usuario) ;

    List<Usuario> getAllUsuarios();

    Usuario getUsuario(String usuarioId);

}
