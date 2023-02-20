package com.idat.florecer.serviceR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.florecer.entity.Usuario;
import com.idat.florecer.repository.IUsuarioRepository;

@Service
public class UsuarioServiceIm {
	
	@Autowired
	IUsuarioRepository usuarioRepo;
	
	public Usuario iniciosesion(String ida,String idas) {
		return usuarioRepo.inicios(ida,idas);
	}
	
	public Usuario findByU(String ida) {
		return usuarioRepo.findByUser(ida);
	}
}
