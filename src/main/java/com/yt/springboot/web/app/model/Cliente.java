package com.yt.springboot.web.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("Cliente")
public class Cliente {
	
	@Id
	private Integer id;
	private String nombre;
	private String ciudad;
	private String email;
	
	
	public Cliente() {
	}
	public Cliente(Integer id, String nombre, String ciudad, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.email = email;
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
