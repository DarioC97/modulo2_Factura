package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Clientes;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDAO clienteDAO;

	@Override
	public List<Clientes> findAll() {
		// TODO Auto-generated method stub
		return clienteDAO.findAll();
		
		
	}

	@Override
	public Clientes findOne(int id) {
		// TODO Auto-generated method stub
		return clienteDAO.findOne();
	}

	@Override
	public void add(int idCliente, String nombre, String apellido, String cedula, int edad, Date fechaNacimiento,
			String direccion, String correo, String telefono) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void up(int idCliente, String nombre, String apellido, String cedula, int edad, Date fechaNacimiento,
			String direccion, String correo, String telefono) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		
	}
	
 
}
