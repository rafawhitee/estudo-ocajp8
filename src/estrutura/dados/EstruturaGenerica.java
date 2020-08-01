package estrutura.dados;

public abstract class EstruturaGenerica<T> implements InterfaceEstruturaGenerica<T> {

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
	public EstruturaGenerica() {
		valor = (T[]) new Object[tamanhoMaximo];
	}

	public EstruturaGenerica(T[] valor) {
		this.valor = valor;
	}

	@SuppressWarnings("unchecked")
	public EstruturaGenerica(int tamanhoMaximo) {
		this.tamanhoMaximo = tamanhoMaximo;
		valor = (T[]) new Object[tamanhoMaximo];
	}

	@Override
	public void adicionar(T objeto) {
		checarExpansao();
		if (objeto != null) {
			valor[proximoIndex] = objeto;
			ultimoIndexInserido = proximoIndex;
			proximoIndex++;
		}
	}
	
//	@Override
//	public void remover(int index) {
//		valor[index] = null;
//	}

	@Override
	public void popularDadosJaInseridos(T[] novoValor) {
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] != null) {
				novoValor[i] = valor[i];
			}
		}
	}
	
	@Override
	public void alterarValoresVetorExpandido(int novoTamanho, T[] novoValor) {
		setValor(novoValor);
		setTamanhoMaximo(novoTamanho);
	}

	@Override
	public boolean validaTamanhoMaximo() {
		int ultimoIndex = ultimoIndex();
		if (ultimoIndexInserido == ultimoIndex)
			return false;

		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void expandirVetor() {
		int novoTamanho = tamanhoMaximo * 2;
		T[] novoValor = (T[]) new Object[novoTamanho];
		popularDadosJaInseridos(novoValor);
		alterarValoresVetorExpandido(novoTamanho, novoValor);
	}

	@Override
	public int ultimoIndex() {
		return tamanhoMaximo - 1;
	}

	@Override
	public int tamanhoRealVetor() {
		int retorno = 0;
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] != null)
				retorno++;
		}
		return retorno;
	}

	@Override
	public String getInfos() {
		String retorno = "Tamanho total do Vetor: " + getTamanhoMaximo() + " \n";
		retorno += "Tamanho real do Vetor: " + tamanhoRealVetor() + " \n";
		retorno += "Ultimo index inserido: " + getUltimoIndexInserido() + " \n";
		return retorno;
	}

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
	
}