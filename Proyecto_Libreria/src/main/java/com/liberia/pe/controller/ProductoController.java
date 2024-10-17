package com.liberia.pe.controller;


import java.util.List;

import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.liberia.pe.model.ProductoEntity;
import com.liberia.pe.service.ProductoService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequiredArgsConstructor
public class ProductoController {
	
	//private final ProductoService productoService;
	
	@GetMapping("/inicio")
	public String mostrarInicio(Model model, HttpSession session) {
		//if (session.getAttribute(name:"usuario")==null) {
			return "redirect:/";
		}
		
		//List<ProductoEntity>listarProductos = productoService.buscarTodosProductos();
		//model.addatr
		//return new String();
	}
	
	
//}
