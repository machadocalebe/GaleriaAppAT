package galeriaApp.controller;

import com.google.gson.Gson;

import galeriaApp.model.domain.Pintura;
import galeriaApp.model.service.PinturaService;
import spark.Route;

public class PinturaController {
	
	

	
	public static Route obterLista = (req, res) -> {
		return PinturaService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		Pintura pintura = new Gson().fromJson(req.body(), Pintura.class);
		
		PinturaService.incluir(pintura);
		
		return "Inclusão feita: " + pintura;
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Pintura filme = PinturaService.obter(index);
		
		PinturaService.excluir(index);
		
		return "Exclusão feita: " + filme;
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Pintura filme = PinturaService.obter(index);
		
		return "Busca feita: " + filme;
	};
}
