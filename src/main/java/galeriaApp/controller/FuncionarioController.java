package galeriaApp.controller;

import com.google.gson.Gson;

import galeriaApp.model.domain.Funcionario;
import galeriaApp.model.service.FuncionarioService;
import spark.Route;

public class FuncionarioController {
	
	

	
	public static Route obterLista = (req, res) -> {
		return FuncionarioService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		Funcionario funcionario = new Gson().fromJson(req.body(), Funcionario.class);
		
		FuncionarioService.incluir(funcionario);
		
		return "Inclusão feita: " + funcionario;
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Funcionario funcionario = FuncionarioService.obter(index);
		
		FuncionarioService.excluir(index);
		
		return "Exclusão feita: " + funcionario;
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Funcionario funcionario = FuncionarioService.obter(index);
		
		return "Busca feita: " + funcionario;
	};
	
}
