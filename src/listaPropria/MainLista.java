package listaPropria;

public class MainLista {

	public static void main(String[] args) {
		Lista<String> lista1 = new Lista<String>(3);
		lista1.adicionar("Ol� mundo 1");
		lista1.adicionar("Ol� mundo 2");
		lista1.adicionar("Ol� mundo 3");
		lista1.adicionar("Ol� mundo 4");
		lista1.adicionar("Ol� mundo 5");
		lista1.adicionar("Ol� mundo 6");
		lista1.adicionar("Ol� mundo 7");
		
		System.out.println(lista1);
		System.out.println(lista1.getInfos());
	}

}
