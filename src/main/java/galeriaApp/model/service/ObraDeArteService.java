package galeriaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import galeriaApp.model.domain.ObraDeArte;

public class ObraDeArteService {

	private static Map<Integer, ObraDeArte> obras = new HashMap<Integer, ObraDeArte>();
	
	private static Integer id = 0;
	
	public static void incluir(ObraDeArte obraDeArte) {
		
		obraDeArte.setId(++id);
		obras.put(obraDeArte.getId(), obraDeArte);
	}
	
	public static void excluir(Integer id) {
		obras.remove(id);
	}
	
	public static Collection<ObraDeArte> obterLista() {
		return obras.values();
	}
	
	public static ObraDeArte obter(Integer id) {
		return obras.get(id);
	}
}


