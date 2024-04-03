package galeriaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import galeriaApp.model.domain.Usuario;

public class UsuarioService {

	private static Map<Integer, Usuario> usuarios = new HashMap<Integer, Usuario>();
	
	private static Integer id = 0;
	
	public static void incluir(Usuario usuario) {
		
		usuario.setId(++id);
		usuarios.put(usuario.getId(), usuario);
	}
	
	public static void excluir(Integer id) {
		usuarios.remove(id);
	}
	
	public static Collection<Usuario> obterLista() {
		return usuarios.values();
	}
	
	public static Usuario obter(Integer id) {
		return usuarios.get(id);
	}
}


