package com.edix.cajero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.edix.cajero.modelo.entitybeans.Cuenta;
import com.edix.cajero.repository.CuentaRepository;

@Controller
public class CuentaController {
	
	@Autowired
	private CuentaRepository crepo;
	
	@GetMapping("/inicio")
	public String procInicio(Model model) {
		
		Cuenta cuenta = crepo.findById(1000).orElse(null);
		model.addAttribute("cuentas", cuenta);
		return "pruebas";
		
	}

}
