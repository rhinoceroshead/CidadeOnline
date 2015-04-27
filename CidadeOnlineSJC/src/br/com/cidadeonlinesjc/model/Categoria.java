package br.com.cidadeonlinesjc.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.cidadeonlinesjc.dao.CategoriaDAO;

@ManagedBean(name = "CategoriaBean")
@ViewScoped
public class Categoria {
	private int id;
	private String descricao;
	private int idSelecionado;
	private Categoria categoria;

	public int getIdSelecionado() {
		return idSelecionado;
	}

	public void setIdSelecionado(int idSelecionado) {
		this.idSelecionado = idSelecionado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void adicionaCategoria() {
		CategoriaDAO dao = new CategoriaDAO();
		dao.adicionaCategoria(this);
	}

	public void alteraCategoria() {
		CategoriaDAO dao = new CategoriaDAO();
		dao.alteraCategoria(this.categoria);
	}

	public void excluiCategoria() {
		CategoriaDAO dao = new CategoriaDAO();
		dao.excluiCategoria(this.categoria);
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}