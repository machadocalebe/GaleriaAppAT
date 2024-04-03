package galeriaApp.model.domain;

public class ObraDeArte {
	
	protected int id;

	protected  String titulo;
	protected  String artista;
	protected  int anoCriacao;
	protected  String estilo;
	protected  boolean disponibilidade;
	
	
	
	public ObraDeArte() {
		this.setTitulo("A Noite Estrelada");
		this.setArtista("Van Gogh");
		this.setAnoCriacao(1889);
		this.setEstilo("Barroco");
		this.setDisponibilidade(false);
	}
	
	public ObraDeArte(String titulo, String artista, int ano, String estilo, boolean disponibilidade) {

		this.setTitulo(titulo);
		this.setArtista(artista);
		this.setAnoCriacao(ano);
		this.setEstilo(estilo);
		this.setDisponibilidade(disponibilidade);
	
	}
	
	@Override
	public String toString() {
		return "ObraDeArte " + id + ": " + titulo + " - " + artista + " - " + anoCriacao + " - " + estilo + " - " + disponibilidade;

	}
	
	
	public String getTitulo() {

		return titulo;
	}
	public void setTitulo(String titulo) {

		this.titulo = titulo;
	}
	public String getArtista() {

		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getAnoCriacao() {

		return anoCriacao;
	}
	public void setAnoCriacao(int anoCriacao) {

		this.anoCriacao = anoCriacao;
	}
	public String getEstilo() {

		return estilo;
	}
	public void setEstilo(String estilo) {

		this.estilo = estilo;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {

		this.disponibilidade = disponibilidade;
	}


	public int getId() {

		return id;
	}


	public void setId(int id) {

		this.id = id;
	}
	
}
