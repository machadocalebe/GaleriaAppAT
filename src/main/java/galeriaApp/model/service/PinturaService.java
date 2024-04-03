package galeriaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import galeriaApp.model.domain.Pintura;

public class PinturaService {

	private static Map<Integer, Pintura> pinturas = new HashMap<Integer, Pintura>();
	
	private static Integer id = 0;
	
	public static void incluir(Pintura pintura) {
		
		pintura.setId(++id);
		pinturas.put(pintura.getId(), pintura);
	}
	
	public static void excluir(Integer id) {
		pinturas.remove(id);
	}
	
	public static Collection<Pintura> obterLista() {
		return pinturas.values();
	}
	
	public static Pintura obter(Integer id) {
		return pinturas.get(id);
	}
}


