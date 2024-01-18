package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Clientes;



public interface ClienteDAO {
	
	// CRUD : Create , Read ,Update,Delete
	
	public List<Clientes>findAll();
	
	public Clientes findOne();
	
	public void add(Clientes cliente);
	
	public void up (Clientes cliente);
	
	public void del(int id);

}
