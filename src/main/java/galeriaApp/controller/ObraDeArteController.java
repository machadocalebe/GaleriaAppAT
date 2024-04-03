package galeriaApp.controller;

import com.google.gson.Gson;

import galeriaApp.model.domain.ObraDeArte;
import galeriaApp.model.service.ObraDeArteService;
import spark.Route;

public class ObraDeArteController {
	
	

	public static Route obterLista = (req, res) -> {
		return ObraDeArteService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		ObraDeArte obraDeArte = new Gson().fromJson(req.body(), ObraDeArte.class);
		
		ObraDeArteService.incluir(obraDeArte);
		
		return "Inclusão feita:" + obraDeArte;
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		ObraDeArte obraDeArte = ObraDeArteService.obter(index);
		
		ObraDeArteService.excluir(index);
		
		return "Exclusão feita: " + obraDeArte;
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		ObraDeArte obraDeArte = ObraDeArteService.obter(index);
		
		return "Busca feita: " + obraDeArte;
	};
}
