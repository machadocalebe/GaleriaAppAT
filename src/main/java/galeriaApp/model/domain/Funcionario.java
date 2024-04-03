package galeriaApp.model.domain;

public class Funcionario {
	
	private Integer id;
	
	private String nome;
	private String cargo;
	private float salario;
	
	
	public Funcionario() {
		this.setNome("Calebe Machado");
		this.setCargo("Administrador");
		this.setSalario(999);
	}
	
	public Funcionario(String nome) {
		this();
		this.setNome(nome);
	}
	
	public Funcionario(String nome, String cargo, float salario) {
		this();
		this.setNome(nome);
		this.setCargo(cargo);
		this.setSalario(salario);
	}
	
	
	@Override
	public String toString() {
		return String.format("\nFuncionário %d: %s - %s - %.2f\n", id, nome, cargo, salario);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
