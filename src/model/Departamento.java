package model;

public class Departamento {
	
	private int andar;
	private String nome;
	private String descricao;
	
	public Departamento() {
		super();
	}

	
	@Override
	public String toString() {
		return "Departamento [andar=" + andar + ", nome=" + nome + ", descricao=" + descricao + "]";
	}


	public Departamento(int andar, String nome, String descricao) {
		this.andar = andar;
		this.nome = nome;
		this.descricao = descricao;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
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
}
