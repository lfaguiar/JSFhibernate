package br.amcom.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

/**
 * @author SIOGP
 */
@Entity
public class LancamentoItem implements Serializable {

	private static final long serialVersionUID = 4408593603914087475L;
	
	@Id
	@ManyToMany  
	@JoinColumn(name ="lancamento_id_accounts", insertable = false, updatable = false)
	private Integer oid_lancamento;

	/*@Id
	@ManyToMany  
	@JoinColumn(name ="item_id_accounts", insertable = false, updatable = false)
	private Integer oid_item;*/
	
	/**
	 * CONSTRUTOR PADRÃO
	 */
	public LancamentoItem() {
		super();
	}
}