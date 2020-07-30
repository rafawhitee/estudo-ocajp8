package listaPropria;

import java.io.Serializable;

public class Lista<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	// Vetor de um Objeto tipado T
	private T[] valor;

	// Controla qual o próximo index a ser inserido
	private int proximoIndex = 0;

	// Ultimo index a ser inserido (-1 é porque não foi inserido ninguém)
	private int ultimoIndexInserido = -1;

	// Tamanho maximo atual (e inicial)
	// Depois vai dobrando
	private int tamanhoMaximo = 10;

	@SuppressWarnings("unchecked")
	public Lista() {
		valor = (T[]) new Object[tamanhoMaximo];
	}

	public Lista(T[] valor) {
		this.valor = valor;
	}

	@SuppressWarnings("unchecked")
	public Lista(int tamanhoMaximo) {
		this.tamanhoMaximo = tamanhoMaximo;
		valor = (T[]) new Object[tamanhoMaximo];
	}

	public void adicionar(T objeto) {
		checarExpansao();
		if (objeto != null) {
			valor[proximoIndex] = objeto;
			ultimoIndexInserido = proximoIndex;
			proximoIndex++;
		}
	}

	public void remover(T objeto) {
		if (objeto != null) {
			for (int i = 0; i < valor.length; i++) {
				if (valor[i].equals(objeto)) {
					valor[i] = null;
				}
			}
		}
	}

	public void remover(int index) {
		valor[index] = null;
	}

	public void remover() {
		valor[ultimoIndexInserido] = null;
		proximoIndex--;
		ultimoIndexInserido--;
	}

	/**** MÉTODOS PRIVADOS ****/

	private void checarExpansao() {
		boolean podeInserir = validaTamanhoMaximo();
		if (!podeInserir)
			expandirVetor();
	}

	// Se já tiver inserido o ultimo index do tamanho maximo atual
	// Cria um novo array de T, com o dobro do tamanhoMaximoAtual
	// Pega todos os dados já inseridos e passa para o mesmo index
	@SuppressWarnings("unchecked")
	private void expandirVetor() {
		int novoTamanho = tamanhoMaximo * 2;
		T[] novoValor = (T[]) new Object[novoTamanho];
		pegarDadosJaInseridos(novoValor);
		alterarValoresVetorExpandido(novoTamanho, novoValor);
	}

	// Faz o set do novo vetor e novo tamanho máximo
	private void alterarValoresVetorExpandido(int novoTamanho, T[] novoValor) {
		setValor(novoValor);
		setTamanhoMaximo(novoTamanho);
	}

	// Popula os dados já inseridos no novoArray com o dobro de tamanho
	private void pegarDadosJaInseridos(T[] novoValor) {
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] != null) {
				novoValor[i] = valor[i];
			}
		}
	}

	// Retorna true se já está no ultimo index
	private boolean validaTamanhoMaximo() {
		int ultimoIndex = ultimoIndex();
		if (ultimoIndexInserido == ultimoIndex)
			return false;

		return true;
	}

	private int ultimoIndex() {
		return tamanhoMaximo - 1;
	}

	/**** FIM DOS MÉTODOS PRIVADOS ****/

	// Pega o tamanho real do vetor (não o máximo)
	// != null
	public int tamanhoRealVetor() {
		int retorno = 0;
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] != null)
				retorno++;
		}
		return retorno;
	}

	// Retorna algumas informações importantes da Lista atual
	public String getInfos() {
		String retorno = "Tamanho total do Vetor: " + getTamanhoMaximo() + " \n";
		retorno += "Tamanho real do Vetor: " + tamanhoRealVetor() + " \n";
		retorno += "Ultimo index inserido: " + getUltimoIndexInserido() + " \n";
		return retorno;
	}

	/*** Getters and Setters dos valores da Classe Lista ***/
	public T[] getValor() {
		return valor;
	}

	public void setValor(T[] valor) {
		this.valor = valor;
	}

	public int getProximoIndex() {
		return proximoIndex;
	}

	public void setProximoIndex(int proximoIndex) {
		this.proximoIndex = proximoIndex;
	}

	public int getUltimoIndexInserido() {
		return ultimoIndexInserido;
	}

	public void setUltimoIndexInserido(int ultimoIndexInserido) {
		this.ultimoIndexInserido = ultimoIndexInserido;
	}

	public int getTamanhoMaximo() {
		return tamanhoMaximo;
	}

	public void setTamanhoMaximo(int tamanhoMaximo) {
		this.tamanhoMaximo = tamanhoMaximo;
	}

	@Override
	public String toString() {
		String retorno = "";
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] != null)
				retorno += ("Valor na Posição " + i + ": " + valor[i] + " \n");
		}
		return retorno;
	}

}