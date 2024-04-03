package galeriaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import galeriaApp.model.domain.Galeria;

public class GaleriaService {

	private static Map<Integer, Galeria> galerias = new HashMap<Integer, Galeria>();
	
	private static Integer id = 0;
	
	public static void incluir(Galeria galeria) {
		
		galeria.setId(++id);
		galerias.put(galeria.getId(), galeria);
	}
	
	public static void excluir(Integer id) {
		galerias.remove(id);
	}
	
	public static Collection<Galeria> obterLista() {
		return galerias.values();
	}
	
	public static Galeria obter(Integer id) {
		return galerias.get(id);
	}
}


