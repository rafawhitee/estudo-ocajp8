package estrutura.dados;

public class Pilha<T> extends EstruturaGenerica<T> implements InterfacePilha<T> {

	private static final long serialVersionUID = 1L;

	@Override
	public void remover() {
		T[] valor = getValor();
		int ultimoIndex = getUltimoIndexInserido();
		if(ultimoIndex > -1) {
			valor[ultimoIndex] = null;
		}
	}
	
	@Override
	public String toString() {
		T[] valor = getValor();
		String retorno = "";
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] != null)
				retorno += ("["+i+"]: " + valor[i] + " \n");
		}
		return retorno;
	}


}