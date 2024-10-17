package com.liberia.pe.service;

import java.util.List;

import com.liberia.pe.model.ProductoEntity;

public interface ProductoService {
	List<ProductoEntity>bucarTodosLibros();
	ProductoEntity buscarProductoPorId(Integer id);
}
