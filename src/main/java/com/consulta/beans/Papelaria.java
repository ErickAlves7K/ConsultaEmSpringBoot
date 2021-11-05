package com.consulta.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produtos")
public class Papelaria {

	@Id
	@Column(name="id")
	private int idProduto;
	
	@Column(name="nome", length=50)
	private String nomeProduto;
	
	@Column(name="cor", length=50)
	private String corProduto;
	
	@Column(name="marca", length=50)
	private String marcaProduto;
	
	@Column(name="preco")
	private float precoProduto;
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCorProduto() {
		return corProduto;
	}
	public void setCorProduto(String corProduto) {
		this.corProduto = corProduto;
	}
	public String getMarcaProduto() {
		return marcaProduto;
	}
	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}
	public float getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}
	
	
}
