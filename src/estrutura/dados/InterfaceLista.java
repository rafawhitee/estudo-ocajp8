package estrutura.dados;

public interface InterfaceLista<T> extends InterfaceEstruturaGenerica<T> {
	
	void remover(int index);
	
	void remover(T objeto);
	
}