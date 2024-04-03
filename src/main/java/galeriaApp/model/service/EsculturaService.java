package galeriaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import galeriaApp.model.domain.Escultura;

public class EsculturaService {

	private static Map<Integer, Escultura> esculturas = new HashMap<Integer, Escultura>();
	
	private static Integer id = 0;
	
	public static void incluir(Escultura filmeTerror) {
		
		filmeTerror.setId(++id);
		esculturas.put(filmeTerror.getId(), filmeTerror);
	}
	
	public static void excluir(Integer id) {
		esculturas.remove(id);
	}
	
	public static Collection<Escultura> obterLista() {
		return esculturas.values();
	}
	
	public static Escultura obter(Integer id) {
		return esculturas.get(id);
	}
}


