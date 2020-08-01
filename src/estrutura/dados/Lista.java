package estrutura.dados;

public class Lista<T> extends EstruturaGenerica<T> implements InterfaceLista<T> {

	private static final long serialVersionUID = 1L;
	
	public Lista() {
		super();
	}
	
	public Lista(T[] valor) {
		super(valor);
	}
	
	public Lista(int tamanhoMaximo) {
		super(tamanhoMaximo);
	}

	@Override
	public void remover(T objeto) {
		T[] valor = getValor();
		if (objeto != null) {
			for (int i = 0; i < valor.length; i++) {
				if (valor[i].equals(objeto)) {
					valor[i] = null;
				}
			}
		}
	}

	@Override
	public void remover(int index) {
		T[] valor = getValor();
		valor[index] = null;
	}
	
	@Override
	public String toString() {
		T[] valor = getValor();
		String retorno = "";
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] != null)
				retorno += ("["+i+"]: " + valor[i] + " ");
		}
		return retorno;
	}
}