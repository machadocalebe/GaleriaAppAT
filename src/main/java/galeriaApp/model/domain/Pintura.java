package galeriaApp.model.domain;

public class Pintura extends ObraDeArte {
	

	
	private String nome;
	private String descricao;
	private int popularidade;
	
	
	public Pintura() {
		super();
		this.setNome("Pintura");
		this.setDescricao("Essa é uma pintura unica!");
		this.setPopularidade(5);
	}
	
	public Pintura(String nome, String descricao, int popularidade) {
		this();
		this.setNome(nome);
		this.setDescricao(descricao);
		this.setPopularidade(popularidade);
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " - " + nome + " - " + descricao + " - " + popularidade;
	}
	
	
	public String getNome() {

        return nome;
	}
	public void setNome(String nome) {

        this.nome = nome;
	}
	public String getDescricao() {

        return descricao;
	}
	public void setDescricao(String descricao) {

        this.descricao = descricao;
	}
	public int getPopularidade() {

        return popularidade;
	}
	public void setPopularidade(int popularidade) {

        this.popularidade = popularidade;
	}



	
}
