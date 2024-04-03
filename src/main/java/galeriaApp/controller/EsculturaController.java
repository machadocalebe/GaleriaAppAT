package galeriaApp.controller;

import com.google.gson.Gson;

import galeriaApp.model.domain.Escultura;
import galeriaApp.model.service.EsculturaService;
import spark.Route;

public class EsculturaController {
	

	
	public static Route obterLista = (req, res) -> {
		return EsculturaService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		Escultura escultura = new Gson().fromJson(req.body(), Escultura.class);
		
		EsculturaService.incluir(escultura);
		
		return "Inclusão feita: " + escultura;
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Escultura filme = EsculturaService.obter(index);
		
		EsculturaService.excluir(index);
		
		return "Exclusão feita: " + filme;
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Escultura filme = EsculturaService.obter(index);
		
		return "Busca feita: " + filme;
	};
}
