package com.liberia.pe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "tb_producto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productoId;
	
	@Column(name= "Nombre_Libro", nullable = false)
	private String nombreLibro;
	
	@Column(name = "Sinopsis_Libro", nullable = false)
	private String sinopsisLibro;
	
	@Column(name = "Url_Imagen", nullable = false)
	private String urlImagen;
	
	
}
