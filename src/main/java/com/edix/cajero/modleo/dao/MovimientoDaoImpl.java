package com.edix.cajero.modleo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edix.cajero.modelo.entitybeans.Movimiento;
import com.edix.cajero.repository.MovimientoRepository;

@Repository
public class MovimientoDaoImpl implements MovimientoDao {
	@Autowired
	private MovimientoRepository mrepo;

	@Override
	public List<Movimiento> buscarTodos() {
		// TODO Auto-generated method stub
		return mrepo.findAll();
	}

	@Override
	public Movimiento buscarUno(int idMovimiento) {
		// TODO Auto-generated method stub
		return mrepo.findById(idMovimiento).orElse(null);
	}

}
