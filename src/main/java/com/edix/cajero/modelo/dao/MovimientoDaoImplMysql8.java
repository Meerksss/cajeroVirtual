package com.edix.cajero.modelo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edix.cajero.modelo.entitybeans.Cuenta;
import com.edix.cajero.modelo.entitybeans.Movimiento;
import com.edix.cajero.repository.MovimientoRepository;

@Repository
public class MovimientoDaoImplMysql8 implements MovimientoDao {
	
	@Autowired
	private MovimientoRepository mrepo;
	
	/*
	 * Método que vuelva la lista de todos los movimientos	
	 */
	@Override
	public List<Movimiento> buscarTodos() {
		// TODO Auto-generated method stub
		return mrepo.findAll();
	}
	
	/*
	 * Método que permite buscar un movimiento a través del idMovimiento, en caso de no encontrarlo devuelve null.	
	 */
	@Override
	public Movimiento buscarUno(int idMovimiento) {
		// TODO Auto-generated method stub
		return mrepo.findById(idMovimiento).orElse(null);
	}
	
	/* 
	 * Método que muestra un listado de los últimos movimientos que ha tenido una cuenta.
	 * Hemos fijado que muestre un listado máximo de 10 movimientos.
	 */
	@Override
	public List<Movimiento> listaUltimosMovimientosByidCuenta(int idCuenta) {
		
		List<Movimiento> lista=new ArrayList<Movimiento>();
		int contador = 0;
		for (int i = mrepo.findMovimientosByIdCuenta(idCuenta).size()-1; i>=0; i--) {
			lista.add(mrepo.findMovimientosByIdCuenta(idCuenta).get(i));
			contador++;
			if (contador == 10) {
				break;
			}
		}
		return lista;
	}
	
	/*
	 * Método que permite crear una retirada de una cuenta
	 */
	@Override
	public int movimientoExtraccion(Cuenta cuenta, double cantidad) {
		// TODO Auto-generated method stub
		
		// Creamos un movimiento nuevo
		Movimiento movimiento = new Movimiento();
		movimiento.setCuenta(cuenta);
		movimiento.setFecha(new Date());
		movimiento.setOperacion("Retirada");
		movimiento.setCantidad(cantidad);
		
		// Y añadimos el movimiento a la lista de movimientos
		int filas=0;
		try {
			mrepo.save(movimiento);
			filas=1;
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		return filas;
	}
	
	/*
	 * Método que permite crear un ingreso de una cuenta
	 */
	@Override
	public int movimientoIngreso(Cuenta cuenta, double cantidad) {
		// TODO Auto-generated method stub
		Movimiento movimiento = new Movimiento();
		movimiento.setCuenta(cuenta);
		movimiento.setFecha(new Date());
		movimiento.setOperacion("Ingreso");
		movimiento.setCantidad(cantidad);
		
		// Ahora añadimos el movimiento a la lista de movimientos
		int filas = 0;
		try {
			mrepo.save(movimiento);
			filas = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

}
