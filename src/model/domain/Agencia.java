package model.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_AGENCIA")
public class Agencia {

	
	@Id
	@Column(name="NR_AGENCIA")
	private Integer numero;
	
	@Column(name="NM_AGENCIA")
	private String nome;
	
	@OneToMany(mappedBy="agencia")
	private List<Conta> contas;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	
	
}
