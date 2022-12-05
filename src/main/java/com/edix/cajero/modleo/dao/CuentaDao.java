package com.edix.cajero.modleo.dao;

import java.util.List;

import com.edix.cajero.modelo.entitybeans.Cuenta;

/*
 * En el DAO implementamos los mótodos que utilizaremos en nuestra APP.
 */

public interface CuentaDao {
	
	List<Cuenta> findAll(); // Encontrar todas las cuentas
	Cuenta findById(int idCuenta); // Encontrar la cuenta por el idCuenta
	int ingresarDinero(Cuenta cuenta, double cantidad); // Ingresar dinero a una cuenta
	int extraerDinero(Cuenta cuenta, double cantidad); // Retirar dinero de una cuenta

}
