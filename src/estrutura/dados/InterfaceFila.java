package estrutura.dados;

public interface InterfaceFila<T> extends InterfaceEstruturaGenerica<T> {

	// � o remover da Fila, o pr�ximo � retirado
	// E cria um novo vetor passando uma posi��o para cada um.
	T proximo();

	// Cria um novo vetor com o tamanho m�ximo atual
	T[] criarNovoVetorMesmoTamanho();

	// Dependendo da Estrutura e ele remover,
	// por exemplo, o cara no meio do vetor
	// Vai ter um nulo entre eles
	void retirarNulosEntreValores(T[] novoValor);

}