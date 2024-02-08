package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Clientes;

public interface ClienteService {

	//CRUD: Create,Read,Update,Delete
	///      ADD  findSelect	Up	del
public List<Clientes> findAll();
	
	public Clientes findOne(int id);
	
	public void add(int idCliente, String nombre, String apellido, String cedula, int edad, Date fechaNacimiento,
			String direccion, String correo, String telefono);
	
	public void up(int idCliente, String nombre, String apellido, String cedula, int edad, Date fechaNacimiento,
			String direccion, String correo, String telefono);
	
	public void del(int id);
}
