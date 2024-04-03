package galeriaApp;

import galeriaApp.controller.PinturaController;
import galeriaApp.controller.ObraDeArteController;
import galeriaApp.controller.EsculturaController;
import galeriaApp.controller.FuncionarioController;
import galeriaApp.controller.GaleriaController;
import galeriaApp.controller.UsuarioController;
import galeriaApp.controller.ViaCepController;
import galeriaApp.model.domain.*;
import galeriaApp.model.domain.Galeria;
import galeriaApp.model.service.PinturaService;
import galeriaApp.model.service.ObraDeArteService;
import galeriaApp.model.service.EsculturaService;
import galeriaApp.model.service.FuncionarioService;
import galeriaApp.model.service.GaleriaService;
import galeriaApp.model.service.UsuarioService;
import spark.Spark;

public class App {

	public static void main(String[] args) {

		Spark.port(8080);

		Spark.get("/", (req, res) -> {
			return App.class.getResourceAsStream("/Index.html");
		});

		/* Rotas */

		Spark.get("/usuario/listar", UsuarioController.obterLista);
		Spark.post("/usuario/incluir", UsuarioController.incluir);
		Spark.delete("/usuario/:id/excluir", UsuarioController.excluir);
		Spark.get("/usuario/:id/obter", UsuarioController.obter);


		Spark.get("/funcionario/listar", FuncionarioController.obterLista);
		Spark.post("/funcionario/incluir", FuncionarioController.incluir);
		Spark.delete("/funcionario/:id/excluir", FuncionarioController.excluir);
		Spark.get("/funcionario/:id/obter", FuncionarioController.obter);
		

		Spark.get("/galeria/listar", GaleriaController.obterLista);
		Spark.post("/galeria/incluir", GaleriaController.incluir);
		Spark.delete("/galeria/:id/excluir", GaleriaController.excluir);
		Spark.get("/galeria/:id/obter", GaleriaController.obter);
		

		Spark.get("/ObraDeArte/listar", ObraDeArteController.obterLista);
		Spark.post("/ObraDeArte/incluir", ObraDeArteController.incluir);
		Spark.delete("/ObraDeArte/:id/excluir", ObraDeArteController.excluir);
		Spark.get("/ObraDeArte/:id/obter", ObraDeArteController.obter);
		

		Spark.get("/pintura/listar", PinturaController.obterLista);
		Spark.post("/pintura/incluir", PinturaController.incluir);
		Spark.delete("/pintura/:id/excluir", PinturaController.excluir);
		Spark.get("/pintura/:id/obter", PinturaController.obter);
		

		Spark.get("/escultura/listar", EsculturaController.obterLista);
		Spark.post("/escultura/incluir", EsculturaController.incluir);
		Spark.delete("/escultura/:id/excluir", EsculturaController.excluir);
		Spark.get("/escultura/:id/obter", EsculturaController.obter);


		Spark.get("/viacep/:cep", ViaCepController.getEndereco);

		/* Fim de rotas */


		/* Usuario */
		Usuario u1 = new Usuario("Alê", "alê@mail", 16);
		Usuario u2 = new Usuario("Fer", "fer@mail", 15);
		Usuario u3 = new Usuario("Gabigol", "gabigoll@mail", 17);
		
		UsuarioService.incluir(u1);
		UsuarioService.incluir(u2);
		UsuarioService.incluir(u3);

		/* Funcionario */
		Funcionario f1 = new Funcionario("Rose", "A Pantera", 15000);
		Funcionario f2 = new Funcionario("Cleber", "O hacker", 7500);
		Funcionario f3 = new Funcionario("Fernandim", "Estagiário", -100);

		FuncionarioService.incluir(f1);
		FuncionarioService.incluir(f2);
		FuncionarioService.incluir(f3);
		
		/* Galerias */
		
		Galeria l1 = new Galeria();
		Galeria l2 = new Galeria("Galeria do Luvre", "Paris", 2002);
		Galeria l3 = new Galeria("Galeria de Pompeia", "Pompeia", 1925);
		
		GaleriaService.incluir(l1);
		GaleriaService.incluir(l2);
		GaleriaService.incluir(l3);


		/* Obras */
		
		ObraDeArte fi1 = new ObraDeArte();
		ObraDeArte fi2 = new ObraDeArte("Minhatura - Igreja São Francisco de Assis", "Aleijadinho", 1766, "Rococó", true);
		ObraDeArte fi3 = new ObraDeArte("Vênus de Willendorf", "Willendorf", 1908, "Pré-Histórico", true);
		
		ObraDeArteService.incluir(fi1);
		ObraDeArteService.incluir(fi2);
		ObraDeArteService.incluir(fi3);


		/* Pintura */
		Pintura fa1 = new Pintura();
		fa1.setTitulo("Judith decapitando Holofernes");
		Pintura fa2 = new Pintura();
		fa2.setTitulo("O quarto em Arles");
		Pintura fa3 = new Pintura();
		fa3.setTitulo("Os fuzilamentos de 3 maio");
		PinturaService.incluir(fa1);
		PinturaService.incluir(fa1);
		PinturaService.incluir(fa1);

		/* Escultura */
		Escultura ft1 = new Escultura();
		ft1.setTitulo("Léviathan Thot");
		Escultura ft2 = new Escultura();
		ft2.setTitulo("Torre de Cristal");
		Escultura ft3 = new Escultura();
		ft3.setTitulo("Pietá");
		EsculturaService.incluir(ft1);
		EsculturaService.incluir(ft1);
		EsculturaService.incluir(ft1);
	}
}