package br.amcom.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Named;

/**
 * @author SIOGP
 */
@Stateless
@LocalBean
@Named
public class TudoService {
	
	/*private static final Logger LOGGER = Logger.getLogger(TudoService.class);
	
	*//**
	 * Construtor Padrão
	 *//*
	public TudoService() {
		super();
	}
	
	@EJB
	private TudoDao dao;
	
	*//**
	 * @Objetivo O metodo createTudo é utilizado para incluir um
	 *           TudoEntity na colecao de elementos.
	 * @param requisicao
	 * @return retorno
	 *//*
	public  TudoRetorno createTudo(TudoRequisicao requisicao) {
		LOGGER.info(SitestaConstantes.INFO_CHAMANDO_METODO_CREATE);
		TudoRetorno retorno = new TudoRetorno();
		try{
			retorno = dao.Gravar(requisicao);
		}catch(Exception e){
			List<String> msgsErro = new ArrayList<String>();
			msgsErro.add(e.getMessage());		
			retorno.setTemErro(Boolean.TRUE);
			retorno.setMsgsErro(msgsErro);
			return retorno;
		}
		List<String> msgsErro = new ArrayList<String>();
		msgsErro.add(SitestaConstantes.INFO_INCLUSAO_SUCESSO);		
		retorno.setTemErro(Boolean.FALSE);
		retorno.setMsgsErro(msgsErro);
		return retorno;
	}

	*//**
	 * @Objetivo O metodo readAllTudo é utilizado para obter todos os
	 *           {GroupId + 'Entity'} existentes na colecao de elementos.
	 * @return retorno
	 *//*
	@SuppressWarnings("unchecked") 
	public TudoRetorno readAllTudo() {
		LOGGER.info(SitestaConstantes.INFO_CHAMANDO_METODO_READ_ALL);
		List<String> msgsErro = new ArrayList<String>();
		TudoRetorno retorno = new TudoRetorno();
		try{
			retorno.setData(dao.listarTudo(Lancamento.class));		
			retorno.listacadastroContent = dao.listarListacadastro();	
		}catch(Exception e){
			msgsErro.add(e.getMessage());		
			retorno.setTemErro(Boolean.TRUE);
			retorno.setMsgsErro(msgsErro);
			return retorno;
		} 
		msgsErro.add(SitestaConstantes.INFO_LEITURA_SUCESSO);
		retorno.setTemErro(Boolean.FALSE);
		retorno.setMsgsErro(msgsErro);
		return retorno;
	}

	*//**
	 * @Objetivo O metodo readTudo(Long id) é utilizado para obter um elemento
	 *           TudoEntity existente na colecao de elementos.
	 * @param id
	 * @return retorno
	 *//*
	public TudoRetorno readTudo(Long id) {
		LOGGER.info(SitestaConstantes.INFO_CHAMANDO_METODO_READ + id);
		List<String> msgsErro = new ArrayList<String>();
		TudoRetorno retorno = new TudoRetorno();
		try{
			retorno.getData().add(dao.buscarPorId(Lancamento.class, id));
		} catch (Exception e){
			msgsErro.add(e.getMessage());
			retorno.setTemErro(Boolean.TRUE);
			retorno.setMsgsErro(msgsErro);
			return retorno;
		}
		msgsErro.add(SitestaConstantes.INFO_LEITURA_ID_SUCESSO);		
		retorno.setTemErro(Boolean.FALSE);
		retorno.setMsgsErro(msgsErro);
		return retorno;
	}

	*//**
	 * @Objetivo O metodo updateTudo é utilizado para atualizar um elemento
	 *           TudoEntity existente na colecao de elementos.
	 * @param id
	 * @param requisicao
	 * @return retorno
	 *//*
	public TudoRetorno updateTudo(Long id, TudoRequisicao requisicao) {
		LOGGER.info(SitestaConstantes.INFO_CHAMANDO_METODO_UPDATE + id + "," + requisicao);
		TudoRetorno retorno = new TudoRetorno();
		try{
			retorno = dao.Atualizar(requisicao);
		}catch(Exception e){
			List<String> msgsErro = new ArrayList<String>();
			msgsErro.add(e.getMessage());		
			retorno.setTemErro(Boolean.TRUE);
			retorno.setMsgsErro(msgsErro);
			return retorno;
		}
		List<String> msgsErro = new ArrayList<String>();
		msgsErro.add(SitestaConstantes.INFO_UPDATE_SUCESSO);
		retorno.setTemErro(Boolean.FALSE);
		retorno.setMsgsErro(msgsErro);
		return retorno;
	}

	*//**
	 * @Objetivo O metodo deleteTudo é utilizado para remover um elemento
	 *           TudoEntity existente na colecao de elementos.
	 * @param id
	 * @return retorno
	 *//*
	public TudoRetorno deleteTudo(Long id) {
		LOGGER.info(SitestaConstantes.INFO_CHAMANDO_METODO_DELETE + id);
		TudoRetorno retorno = new TudoRetorno();
		try {
			dao.excluirObj(Lancamento.class, id);
		} catch (Exception e) {
			retorno.setTemErro(Boolean.TRUE);
			List<String> msgsErro = new ArrayList<String>();
			msgsErro.add(e.getMessage());
			retorno.setMsgsErro(msgsErro);
		}
		List<String> msgsErro = new ArrayList<String>();
		msgsErro.add(SitestaConstantes.INFO_EXCLUSAO_SUCESSO);		
		retorno.setTemErro(Boolean.FALSE);
		retorno.setMsgsErro(msgsErro);
		return retorno;
	}
	
	*//**
	 * @Objetivo O metodo iniciarTudo é utilizado para inserir os valores iniciais
	 *           dos elementos tipo 'input-select' e os valores da tabela no banco de dados.
	 *//*
	public void iniciarTudo(){
		dao.gravarListacadastro("Item 1");			   
		dao.gravarListacadastro("Item 2");			   
		dao.gravarListacadastro("Item 3");			   
		for( int i = 1; i<=10 ; i++){
			TudoRequisicao requisicao = new TudoRequisicao();
				      	
				      	
				      	
				      	
				      	
				      	
				      	
				      	
				      	
				      	
				      	
			requisicao.setNomecadastro("ItemLinha" + i);
				      	
			requisicao.setDatacadastro("ItemLinha" + i);
				      	
				      	
	   		ListacadastroTudo listacadastro= new ListacadastroTudo();
			listacadastro.setId(1);
			requisicao.setListacadastro(listacadastro);
				      	
				      	
				      	
				      	
			requisicao.setSlidernumlabel(0);
				      	
				      	
			requisicao.setSwitcherswitinformeolabel(true);
			requisicao.setOptopces("ItemLinha" + i);
				      	
			requisicao.setTxtdescricao("ItemLinha" + i);
				      	
				      	
				      	
			dao.Gravar(requisicao);
			}
		}*/
}