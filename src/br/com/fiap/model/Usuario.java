package br.com.fiap.model;

import java.sql.Date;

// JavaBeans
public class Usuario {
	
	// Atributos
	private long id;
	private String nome;
	private String email;
	private Date dataCadastro;
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
		this.dataCadastro = new Date(System.currentTimeMillis());
	}
	
	public Usuario() {
		
	}
	
	// Getters e Setters
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
}
