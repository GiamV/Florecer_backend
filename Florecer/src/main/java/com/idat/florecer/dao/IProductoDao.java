package com.idat.florecer.dao;

import org.springframework.data.repository.CrudRepository;

import com.idat.florecer.entity.Producto;



public interface IProductoDao extends CrudRepository<Producto, Long  >{

}
