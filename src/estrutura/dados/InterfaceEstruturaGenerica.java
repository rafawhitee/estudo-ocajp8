package estrutura.dados;

import java.io.Serializable;

public interface InterfaceEstruturaGenerica<T> extends Serializable {
	
	// Adiciona um item a Estrutura de Dados
	void adicionar(T objeto);
		
	// Popular os dados j� inseridos no vetor atual
	// Para o novo vetor
	void popularDadosJaInseridos(T[] novoValor);
	
	// Verifica se � para expandir
	// M�todo default
	default void checarExpansao() {
		boolean podeInserir = validaTamanhoMaximo();
		if(!podeInserir) {
			expandirVetor();
		}
	}
	
	// Altera os valores novoTamanho e novoValor
	void alterarValoresVetorExpandido(int novoTamanho, T[] novoValor);
	
	// Verifica se j� est� no tamanho m�ximo
	boolean validaTamanhoMaximo();
	
	// Checar Expans�o, se for true,
	void expandirVetor();
	
	// Retorna o ultimo Index
	int ultimoIndex();
	
	// Tamanho Real do Vetor e n�o o M�ximo
	int tamanhoRealVetor();
	
	// Retorna as informa��es do vetor
	String getInfos();

}