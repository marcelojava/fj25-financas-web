package br.com.caelum.financas.mb;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.caelum.financas.dao.ContaDao;
import br.com.caelum.financas.modelo.Conta;

@Model
public class QtdeMovimentacoesDaContaBean {
	
	@Inject
	ContaDao contaDao;
	
	private Conta conta = new Conta();
	private int quantidade;
	
	public void lista() {
		System.out.println("Exibindo as quantidades de movimentacoes da conta");
		conta 		= contaDao.busca(conta.getId());
		quantidade 	= conta.getMovimentacoes().size();
	
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
