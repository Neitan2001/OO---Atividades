package modelo;
import java.util.Date;

/**
 * Modela de classe abstrata que origina as classes Recebimento e Despesa
 * @author Natan Tavares Santana
 * @author Isaac Menezes Pereira
 * @version 1.0 (March 2021)
 */

public abstract class Entrada {
	protected Date data;
	protected String descricao;
	protected String tipo;
	protected Conta conta;
	protected int id;

	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
}
