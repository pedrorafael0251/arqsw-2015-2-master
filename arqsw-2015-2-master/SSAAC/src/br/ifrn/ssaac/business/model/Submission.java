package br.ifrn.ssaac.business.model;

public class Submission {
	private long id;
	private String nome;
	private String status; 

	public Submission(String nome, String status) {
		super();

		this.nome = nome;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}