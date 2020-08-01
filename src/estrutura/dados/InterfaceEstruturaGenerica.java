package estrutura.dados;

import java.io.Serializable;

public interface InterfaceEstruturaGenerica<T> extends Serializable {
	
	// Adiciona um item a Estrutura de Dados
	void adicionar(T objeto);
		
	// Popular os dados já inseridos no vetor atual
	// Para o novo vetor
	void popularDadosJaInseridos(T[] novoValor);
	
	// Verifica se é para expandir
	// Método default
	default void checarExpansao() {
		boolean podeInserir = validaTamanhoMaximo();
		if(!podeInserir) {
			expandirVetor();
		}
	}
	
	// Altera os valores novoTamanho e novoValor
	void alterarValoresVetorExpandido(int novoTamanho, T[] novoValor);
	
	// Verifica se já está no tamanho máximo
	boolean validaTamanhoMaximo();
	
	// Checar Expansão, se for true,
	void expandirVetor();
	
	// Retorna o ultimo Index
	int ultimoIndex();
	
	// Tamanho Real do Vetor e não o Máximo
	int tamanhoRealVetor();
	
	// Retorna as informações do vetor
	String getInfos();

}