package galeriaApp.model.domain;

public class Escultura extends ObraDeArte {
	

	
	private String criacao;
	private String material;
	private String dimensoes;
	
	public Escultura() {
		super();
		this.setCriacao("A rocha");
		this.setMaterial("Sedimentos");
		this.setDimensoes("1m²");
	}
	
	public Escultura(String criacao, String material, String dimensoes) {
		this();
		this.setCriacao(criacao);
		this.setMaterial(material);
		this.setDimensoes(dimensoes);
	}
	
	
	@Override
	public String toString() {
		
		return super.toString() + " - " + criacao + " - " + material + " - " + dimensoes;
	}
	
	public String getDimensoes() {
		return dimensoes;
	}
	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCriacao() {
		return criacao;
	}
	public void setCriacao(String criacao) {
		this.criacao = criacao;
	}


	

	
}
