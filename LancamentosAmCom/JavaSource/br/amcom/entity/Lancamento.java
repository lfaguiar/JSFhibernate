package br.amcom.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author SIOGP
 */
@Entity
public class Lancamento implements Serializable {

	private static final long serialVersionUID = 4408593603914087475L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SQ_SEQ")
	@SequenceGenerator(name = "SQ_SEQ", sequenceName = "SQ_TUDO", initialValue = 1)
	private Integer oid;
	
	@Temporal(TemporalType.DATE)
	private Date dt_inicial;
	
	@Temporal(TemporalType.DATE)
	private Date dt_final ;
	
	private Integer vl_total;
	private String observacao;
	
	/**
	 * CONSTRUTOR PADRÃO
	 */
	public Lancamento() {
		super();
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDt_final() {
		return dt_final;
	}

	public void setDt_final(Date dt_final) {
		this.dt_final = dt_final;
	}

	public Date getDt_inicial() {
		return dt_inicial;
	}

	public void setDt_inicial(Date dt_inicial) {
		this.dt_inicial = dt_inicial;
	}

	public Integer getVl_total() {
		return vl_total;
	}

	public void setVl_total(Integer vl_total) {
		this.vl_total = vl_total;
	}
}