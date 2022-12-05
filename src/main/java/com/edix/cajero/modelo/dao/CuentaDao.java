package com.edix.cajero.modelo.dao;

import java.util.List;

import com.edix.cajero.modelo.entitybeans.Cuenta;

/*
 * En el DAO implementamos los mótodos que utilizaremos en nuestra APP.
 */

public interface CuentaDao {
	
	List<Cuenta> findAll(); // Método que lista todas las cuentas
	Cuenta findById(int idCuenta); // Método que localiza la cuenta por el idCuenta
	int ingresarDinero(Cuenta cuenta, double cantidad); // Método que permite realizar un ingreso a una cuenta
	int extraerDinero(Cuenta cuenta, double cantidad); // Método que permite retirar dinero de una cuenta

}
