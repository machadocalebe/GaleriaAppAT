package galeriaApp.controller;

import com.google.gson.Gson;

import galeriaApp.model.domain.Galeria;
import galeriaApp.model.service.GaleriaService;
import spark.Route;

public class GaleriaController {

	
	public static Route obterLista = (req, res) -> {
		return GaleriaService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		Galeria galeria = new Gson().fromJson(req.body(), Galeria.class);
		
		GaleriaService.incluir(galeria);
		
		return "Inclusão feita: " + galeria;
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Galeria galeria = GaleriaService.obter(index);
		
		GaleriaService.excluir(index);
		
		return "Exclusão feita: " + galeria;
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Galeria galeria = GaleriaService.obter(index);
		
		return "Busca feita: " + galeria;
	};
	
}
