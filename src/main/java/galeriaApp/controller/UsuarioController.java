package galeriaApp.controller;

import com.google.gson.Gson;

import galeriaApp.model.domain.Usuario;
import galeriaApp.model.service.UsuarioService;
import spark.Route;

public class UsuarioController {
	
	

	
	public static Route obterLista = (req, res) -> {
		return UsuarioService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		Usuario usuario = new Gson().fromJson(req.body(), Usuario.class);
		
		UsuarioService.incluir(usuario);
		
		return "Inclusão feita: " + usuario;
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Usuario usuario = UsuarioService.obter(index);
		
		UsuarioService.excluir(index);
		
		return "Exclusão feita: " + usuario;
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Usuario usuario = UsuarioService.obter(index);
		
		return "Busca feita: " + usuario;
	};
	
}
