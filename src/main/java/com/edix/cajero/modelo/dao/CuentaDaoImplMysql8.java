package com.edix.cajero.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edix.cajero.modelo.entitybeans.Cuenta;
import com.edix.cajero.repository.CuentaRepository;

public class CuentaDaoImplMysql8 implements CuentaDao{
	
	@Autowired
	private CuentaRepository crepo;
	
	/*
	 * Con este método mostramos una lista con todas las cuentas.
	 */
	@Override
	public List<Cuenta> findAll() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}
	
	/*
	 * Con este método encontramos una cuenta a través de su idCuenta, y en caso de no existir devuelve un null.
	 */
	@Override
	public Cuenta findById(int idCuenta) {
		Cuenta cuenta = new Cuenta();
		cuenta.setIdCuenta(idCuenta);
		int pos = crepo.findAll().indexOf(cuenta);
		if (pos == -1) {
			return null;
		} else {
			return crepo.findById(idCuenta).orElse(null);
		}
	}

	
	@Override
	public int ingresarDinero(Cuenta cuenta, double cantidad) {
		// TODO Auto-generated method stub
		
		// Aquí actualizamos el saldo de la cuenta tras el ingreso 
		cuenta.setSaldo(cuenta.getSaldo()+cantidad);
		
		// Y tras la operación actualizamos los valores en nuestra BBDD 
		int filas = 0;
		try {
			crepo.save(cuenta);
			filas = 1;
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		return filas;
			
		}
	
	@Override
	public int extraerDinero(Cuenta cuenta, double cantidad) {
		// TODO Auto-generated method stub
		
		// Aquí actualizamos el salado de la cuenta tras la retirada
		cuenta.setSaldo(cuenta.getSaldo()-cantidad);
		
		// Y tras la operación actualizamos los valores en la BBDD
		int filas = 0;
		try {
			crepo.save(cuenta);
			filas = 1;
		}catch (Exception e) {
			e.printStackTrace();
				
		}
		return filas;
	}

}
