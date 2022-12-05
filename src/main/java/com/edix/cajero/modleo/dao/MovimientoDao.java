package com.edix.cajero.modleo.dao;

import java.util.List;

import com.edix.cajero.modelo.entitybeans.Movimiento;

public interface MovimientoDao {
	
	List<Movimiento> buscarTodos();
	Movimiento buscarUno(int idMovimiento);

}
