package com.idat.florecer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.florecer.dao.IUsuarioDao;
import com.idat.florecer.entity.Usuario;
@Service
public class IUsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Transactional(readOnly=true)
	
	@Override
	public List<Usuario> findAll() {
		
		return (List<Usuario>)usuarioDao.findAll();
	}
	@Transactional
	@Override
	public void save(Usuario usuario) {
		usuarioDao.save(usuario);
		
	}
	@Transactional
	@Override
	public Usuario editarUsuario(Long id) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(id).orElse(null);
	}
	@Transactional
	@Override
	public void eliminarUsuario(Long id) {
		usuarioDao.deleteById(id);
		
	}
	@Override
	public Usuario findById(Long id) {
		return usuarioDao.findById(id).orElse(null);
		
	}

}
