package br.com.rrprojetos.sample.web.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConvidadosController {

	/**
	 * LOG
	 */
	private static final Logger LOG = Logger.getLogger(ConvidadosController.class);
	
	@RequestMapping("/convidados")
	public String listar() {
		LOG.info("Listando convidados");
		
		return "ListaConvidados";
	}
}
