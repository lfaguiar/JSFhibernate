package br.amcom.dao;

import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author lfaguiar
 */
@Named
public class GenericDao<T> {

	@PersistenceContext
	private EntityManager emanager;

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void removerObjeto(final Class<T> tipo, final Long id) throws Exception {
		try {
			emanager.remove(emanager.getReference(tipo, id));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public void excluirObj(final Class<T> tipo, final Long id) throws Exception {
		try {
			emanager.remove(emanager.getReference(tipo, id));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public T buscarPorId(final Class<T> tipo, final Long id) {
		return emanager.find(tipo, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> listarTudo(final Class<T> tipo) {
		return emanager.createQuery("SELECT t FROM " + tipo.getSimpleName() + " t").getResultList();
	}
}