package br.amcom.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author SIOGP
 */
@Entity
public class Item implements Serializable {

	private static final long serialVersionUID = 4408593603914087475L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SQ_SEQ")
	@SequenceGenerator(name = "SQ_SEQ", sequenceName = "SQ_TUDO", initialValue = 1)
	private Long oid;
	
	private String valor;
	private String descricao;
	
	/**
	 * CONSTRUTOR PADRÃO
	 */
	public Item() {
		super();
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}