package br.amcom.dao;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.amcom.entity.LancamentoItem;

@Named
public class LancamentoDao extends GenericDao<LancamentoItem>{
	
	@PersistenceContext
	private EntityManager em;
	
	/*public TudoRetorno Atualizar(TudoRequisicao requisicao){
		TudoRetorno retorno = new TudoRetorno();
		try{
			Query qryAdm;
			qryAdm = em.createNativeQuery("UPDATE TUDOENTITY"+
											" SET NOMECADASTRO = ?1 , DATACADASTRO = ?2 , FK_LISTACADASTRO = ?3 , SLIDERNUMLABEL = ?4 , SWITCHERSWITINFORMEOLABEL = ?5 , OPTOPCES = ?6 , TXTDESCRICAO = ?7" +		
											" WHERE ID = ?8");
			qryAdm.setParameter(1, requisicao.getNomecadastro());
			qryAdm.setParameter(2, requisicao.getDatacadastro());
			qryAdm.setParameter(3, requisicao.getListacadastro().getId());
			qryAdm.setParameter(4, requisicao.getSlidernumlabel());
			qryAdm.setParameter(5, requisicao.getSwitcherswitinformeolabel());
			qryAdm.setParameter(6, requisicao.getOptopces());
			qryAdm.setParameter(7, requisicao.getTxtdescricao());
			qryAdm.setParameter(8, requisicao.getId());
			qryAdm.executeUpdate();
		} catch (Exception e) {
			List<String> msgsErro = new ArrayList<String>();
			msgsErro.add(e.getMessage());		
			retorno.setTemErro(Boolean.TRUE);
			retorno.setMsgsErro(msgsErro);
			return retorno;
		}
		retorno.setTemErro(Boolean.FALSE);
		List<String> msgsErro = new ArrayList<String>();
		msgsErro.add(SitestaConstantes.INFO_INCLUSAO_SUCESSO);	
		retorno.setMsgsErro(msgsErro);
		return retorno;
	}


public TudoRetorno Gravar(TudoRequisicao requisicao){
		TudoRetorno retorno = new TudoRetorno();
		try{
			Query qryAdm;				
			qryAdm = em.createNativeQuery("INSERT INTO TUDOENTITY  ( ID , NOMECADASTRO , DATACADASTRO , FK_LISTACADASTRO , SLIDERNUMLABEL , SWITCHERSWITINFORMEOLABEL , OPTOPCES , TXTDESCRICAO ) VALUES ( SQ_TUDO.NEXTVAL ,  ?1 , ?2 , ?3 , ?4 , ?5 , ?6 , ?7 )");
			qryAdm.setParameter(1, requisicao.getNomecadastro());
			qryAdm.setParameter(2, requisicao.getDatacadastro());
			qryAdm.setParameter(3, requisicao.getListacadastro().getId());
			qryAdm.setParameter(4, requisicao.getSlidernumlabel());
			qryAdm.setParameter(5, requisicao.getSwitcherswitinformeolabel());
			qryAdm.setParameter(6, requisicao.getOptopces());
			qryAdm.setParameter(7, requisicao.getTxtdescricao());
			qryAdm.executeUpdate();
		} catch (Exception e) {
			List<String> msgsErro = new ArrayList<String>();
			msgsErro.add(e.getMessage());		
			retorno.setTemErro(Boolean.TRUE);
			retorno.setMsgsErro(msgsErro);
			return retorno;
		}
		retorno.setTemErro(Boolean.FALSE);
		List<String> msgsErro = new ArrayList<String>();
		msgsErro.add(SitestaConstantes.INFO_INCLUSAO_SUCESSO);	
		retorno.setMsgsErro(msgsErro);
		return retorno;
	}
		
	public void gravarListacadastro(String s){
		Query qryAdm;	
		qryAdm = em.createNativeQuery("INSERT INTO LISTACADASTROTUDO( ID , DESC ) VALUES ( SQ_TUDO_LISTACADASTRO.NEXTVAL , ?1 )");
		qryAdm.setParameter(1, s);
		qryAdm.executeUpdate();	   
	}	
	
	@SuppressWarnings("unchecked")
	public List<ListacadastroTudo> listarListacadastro() {
		return em.createNativeQuery("SELECT * FROM LISTACADASTROTUDO", ListacadastroTudo.class).getResultList();
	}*/
}