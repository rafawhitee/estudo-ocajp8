package estrutura.dados;

public class Fila<T> extends EstruturaGenerica<T> implements InterfaceFila<T> {

	private static final long serialVersionUID = 1L;

	@Override
	public T proximo() {
		T[] valor = getValor();
		T primeiro = null;
		if (valor.length > 0) {
			primeiro = valor[0];
			valor[0] = null;
		}
		retirarNulosEntreValores(criarNovoVetorMesmoTamanho());
		return primeiro;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T[] criarNovoVetorMesmoTamanho() {
		return (T[]) new Object[getTamanhoMaximo()];
	}

	@Override
	public void retirarNulosEntreValores(T[] novoValor) {
		T[] valor = getValor();
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] != null) {
				novoValor[i] = valor[i];
			}
		}
		setValor(novoValor);
	}

	@Override
	public String toString() {
		T[] valor = getValor();
		String retorno = "";
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] != null)
				retorno += ("[" + i + "]: " + valor[i] + " ");
		}
		return retorno;
	}

}