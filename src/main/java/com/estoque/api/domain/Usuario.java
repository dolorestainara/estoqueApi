package com.estoque.api.domain;

import java.util.Objects;

public class Usuario {
	private Integer usuario_id;
	private String nome;
	private String Password;
	public Usuario() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(Integer usuario_id, String nome, String password) {
		super();
		this.usuario_id = usuario_id;
		this.nome = nome;
		Password = password;
	}
	public Integer getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(Integer usuario_id) {
		this.usuario_id = usuario_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(usuario_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(usuario_id, other.usuario_id);
	}
	

}
