package com.edix.cajero.modleo.dao;

import java.util.List;

import com.edix.cajero.modelo.entitybeans.Cuenta;
import com.edix.cajero.modelo.entitybeans.Movimiento;

public interface MovimientoDao {
	
	List<Movimiento> buscarTodos(); // Método que lista todos los movimientos
	Movimiento buscarUno(int idMovimiento); // Método que localiza un movimiento por el idMovimiento
	List<Movimiento> listaUltimosMovimientos(int idCuenta); // Método que muestra el listado de los últimos movimientos
	int movimientoExtraccion(Cuenta cuenta, double cantidad); // Método que permite crear un movimiento que extrae dinero de una cuenta
	int movimientoIngreso(Cuenta cuenta, double cantidad); // Método que permite crear un movimiento que ingrese dinero en una cuenta
	
}
