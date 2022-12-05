package com.edix.cajero.modleo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edix.cajero.modelo.entitybeans.Cuenta;

public class CuentaDaoImpl implements CuentaDao{
	
	@Autowired
	
	@Override
	public List<Cuenta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cuenta findById(int idCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int ingresarDinero(Cuenta cuenta, double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int extraerDinero(Cuenta cuenta, double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

}
