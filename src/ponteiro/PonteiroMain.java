package ponteiro;

// Variáveis Primitivas e suas classes Wrapper não 'usam' ponteiro quando é passado por parâmetro 
public class PonteiroMain {

	public static void main(String[] args) {
		
		Integer valor1 = new Integer(3);

		// Chama o método duplicar que duplica o valor passado
		duplicar(valor1);

		// O valor a ser mostrado aqui, é o valor na hora do new, no caso 3
		// Pois o método duplicar, recebe um Integer como parâmetro
		// Classes Wrapper não são passadas com Ponteiro
		System.out.println("Valor no Main depois do duplicar SEM retorno: " + valor1); // Imprime 3
		
		// Um jeito de alterar o valor, é o método que duplica e retorna o novo valor
		// Então você faz uma nova atribuição com o retorno do método duplicarRetornando
		valor1 = duplicarRetornando(valor1);
		
		// O valor a ser mostrado aqui vai ser o valor duplicado, pois esse método acima, retorna
		System.out.println("Valor no Main depois do duplicar COM retorno: " + valor1); // Imprime o valor duplicado, no caso 6
		
		
		/* Com POJO  */
		
		// Agora vamos mostrar como uma classe própria
		ClasseTeste classeTeste = new ClasseTeste(10);
		System.out.println("Valor da ClasseTeste ANTES de chamar o duplicar que recebe uma ClasseTeste como parâmetro: " + classeTeste.getValor());
			
		// Como é passado a classeTeste como parâmetro, de fato o valor é duplicado em todos os lugares
		// Pois os POJO são passados como referência (ponteiro)
		duplicar(classeTeste);
		System.out.println("Valor da ClasseTeste DEPOIS de chamar o duplicar que recebe uma ClasseTeste como parâmetro: " + classeTeste.getValor());
		
		/* Com STRING */
		
		// String não são passadas como referências também
		// As alterações que você faz no método, só serão visiveis no escopo do método
		String teste = "Olá Mundo";
		
		// Ele modifica a String, mas a string modificada só será visível dentro do método colocarPalavras
		colocarPalavras(teste);
		System.out.println(teste);
		
		// O método modifica a String, mas retorno
		// E o retorno está sendo atribuido a variável, então o valor de fato, vai ser alterado
		teste = colocarPalavrasComRetorno(teste);
		System.out.println(teste);
	}
	
	private static void colocarPalavras(String str) {
		if(str != null) {
			str = str.concat(", tudo bem com vocês?");
		}
	}
	
	private static String colocarPalavrasComRetorno(String str) {
		if(str != null) {
			str = str.concat(", tudo bem com vocês?");
			return str;
		}
		return null;
	}

	// Método privado que recebe um Integer e duplica
	// Como classe Wrapper não passa Referência, o valor duplicado só é visível aqui dentro
	private static void duplicar(Integer valor) {
		valor = new Integer(valor * 2);
		// poderia ser assim tb
		// valor = valor * 2;
		System.out.println("Valor dentro do método duplicar: " + valor);
	}

	// Método privado que recebe um Integer, duplica e retorna
	private static Integer duplicarRetornando(Integer valor) {
		if(valor != null)
			return valor * 2;
		
		return null;
	}
	
	// Ele recebe como parâmetro um objeto da ClasseTeste
	// POJO novos, são passados como ponteiro (referência)
	// Então o valor será refletido de onde foi chamado e todos os lugares que apontam para o mesmo lugar da memória
	private static void duplicar(ClasseTeste classeTeste) {
		if(classeTeste != null) {
			classeTeste.setValor(classeTeste.getValor() * 2);
		}
	}

}