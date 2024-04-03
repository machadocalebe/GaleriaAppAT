package galeriaApp.model.domain;

import java.util.List;

public class Galeria {
	
	private int id;
	private String nome;
	private String localizacao;
	private int anoComecoFuncionamento;
	private Funcionario funcionario;
	private List<ObraDeArte> obraDeArte;
	
	public Galeria() {
		this.setNome("Galeria do Tempo");
		this.setLocalizacao("Brasil");
		this.setAnoComecoFuncionamento(2000);
	}
	
	public Galeria(String nome, String localizacao, int ano) {
		this();
		this.setNome(nome);
		this.setLocalizacao(localizacao);
		this.setAnoComecoFuncionamento(ano);
	}
	
	
	@Override
	public String toString() {
		return "Galeria " + id + ": " + nome + " - " + localizacao + " - " + anoComecoFuncionamento;

	}
	
	public String getNome() {

		return nome;
	}
	public void setNome(String nome) {

		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public int getAnoComecoFuncionamento() {
		return anoComecoFuncionamento;
	}
	public void setAnoComecoFuncionamento(int anoComecoFuncionamento) {
		this.anoComecoFuncionamento = anoComecoFuncionamento;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<ObraDeArte> getFilme() {
		return obraDeArte;
	}

	public void setFilme(List<ObraDeArte> obraDeArte) {
		this.obraDeArte = obraDeArte;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
