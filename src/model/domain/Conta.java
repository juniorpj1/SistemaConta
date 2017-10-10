package model.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_CONTA")
public class Conta implements Serializable {

	@Id
	@Column(name="NR_CONTA")
	private Integer numero;
	
	@Column(name="VL_SALDO")
	private Double saldo;
	
	@ManyToOne
	@JoinColumn(name="CD_AGENCIA", referencedColumnName="CD_AGENCIA")
	private Agencia agencia;
	
	public Conta(){
		
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
