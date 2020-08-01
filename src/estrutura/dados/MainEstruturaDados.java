package estrutura.dados;

public class MainEstruturaDados {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>();
		lista.adicionar("Laranja");
		lista.adicionar("Maça");
		lista.adicionar("Pêra");
		lista.adicionar("Banana");
		lista.adicionar("Melância");
		System.out.println(lista);
	
		
		Pilha<String> pilha = new Pilha<String>();
		pilha.adicionar("Prato de Prata");
		pilha.adicionar("Pilha de Prata 2");
		pilha.adicionar("Prato de Chumbo");
		pilha.adicionar("Prato Normal");
		pilha.adicionar("Prato Normal 2");
		pilha.remover();
		System.out.println(pilha);
		
		Fila<String> fila = new Fila<String>();
		fila.adicionar("Rafael Nunes");
		fila.adicionar("João Kléber");
		fila.adicionar("Roberto");
		fila.adicionar("Francisco");
		fila.adicionar("Renato");
		System.out.println(fila);
	}

}
