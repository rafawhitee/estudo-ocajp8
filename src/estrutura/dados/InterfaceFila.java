package estrutura.dados;

public interface InterfaceFila<T> extends InterfaceEstruturaGenerica<T> {

	// É o remover da Fila, o próximo é retirado
	// E cria um novo vetor passando uma posição para cada um.
	T proximo();

	// Cria um novo vetor com o tamanho máximo atual
	T[] criarNovoVetorMesmoTamanho();

	// Dependendo da Estrutura e ele remover,
	// por exemplo, o cara no meio do vetor
	// Vai ter um nulo entre eles
	void retirarNulosEntreValores(T[] novoValor);

}