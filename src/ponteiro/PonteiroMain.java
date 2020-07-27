package ponteiro;

// Vari�veis Primitivas e suas classes Wrapper n�o 'usam' ponteiro quando � passado por par�metro 
public class PonteiroMain {

	public static void main(String[] args) {
		
		Integer valor1 = new Integer(3);

		// Chama o m�todo duplicar que duplica o valor passado
		duplicar(valor1);

		// O valor a ser mostrado aqui, � o valor na hora do new, no caso 3
		// Pois o m�todo duplicar, recebe um Integer como par�metro
		// Classes Wrapper n�o s�o passadas com Ponteiro
		System.out.println("Valor no Main depois do duplicar SEM retorno: " + valor1); // Imprime 3
		
		// Um jeito de alterar o valor, � o m�todo que duplica e retorna o novo valor
		// Ent�o voc� faz uma nova atribui��o com o retorno do m�todo duplicarRetornando
		valor1 = duplicarRetornando(valor1);
		
		// O valor a ser mostrado aqui vai ser o valor duplicado, pois esse m�todo acima, retorna
		System.out.println("Valor no Main depois do duplicar COM retorno: " + valor1); // Imprime o valor duplicado, no caso 6
		
		
		/* Com POJO  */
		
		// Agora vamos mostrar como uma classe pr�pria
		ClasseTeste classeTeste = new ClasseTeste(10);
		System.out.println("Valor da ClasseTeste ANTES de chamar o duplicar que recebe uma ClasseTeste como par�metro: " + classeTeste.getValor());
			
		// Como � passado a classeTeste como par�metro, de fato o valor � duplicado em todos os lugares
		// Pois os POJO s�o passados como refer�ncia (ponteiro)
		duplicar(classeTeste);
		System.out.println("Valor da ClasseTeste DEPOIS de chamar o duplicar que recebe uma ClasseTeste como par�metro: " + classeTeste.getValor());
		
		/* Com STRING */
		
		// String n�o s�o passadas como refer�ncias tamb�m
		// As altera��es que voc� faz no m�todo, s� ser�o visiveis no escopo do m�todo
		String teste = "Ol� Mundo";
		
		// Ele modifica a String, mas a string modificada s� ser� vis�vel dentro do m�todo colocarPalavras
		colocarPalavras(teste);
		System.out.println(teste);
		
		// O m�todo modifica a String, mas retorno
		// E o retorno est� sendo atribuido a vari�vel, ent�o o valor de fato, vai ser alterado
		teste = colocarPalavrasComRetorno(teste);
		System.out.println(teste);
	}
	
	private static void colocarPalavras(String str) {
		if(str != null) {
			str = str.concat(", tudo bem com voc�s?");
		}
	}
	
	private static String colocarPalavrasComRetorno(String str) {
		if(str != null) {
			str = str.concat(", tudo bem com voc�s?");
			return str;
		}
		return null;
	}

	// M�todo privado que recebe um Integer e duplica
	// Como classe Wrapper n�o passa Refer�ncia, o valor duplicado s� � vis�vel aqui dentro
	private static void duplicar(Integer valor) {
		valor = new Integer(valor * 2);
		// poderia ser assim tb
		// valor = valor * 2;
		System.out.println("Valor dentro do m�todo duplicar: " + valor);
	}

	// M�todo privado que recebe um Integer, duplica e retorna
	private static Integer duplicarRetornando(Integer valor) {
		if(valor != null)
			return valor * 2;
		
		return null;
	}
	
	// Ele recebe como par�metro um objeto da ClasseTeste
	// POJO novos, s�o passados como ponteiro (refer�ncia)
	// Ent�o o valor ser� refletido de onde foi chamado e todos os lugares que apontam para o mesmo lugar da mem�ria
	private static void duplicar(ClasseTeste classeTeste) {
		if(classeTeste != null) {
			classeTeste.setValor(classeTeste.getValor() * 2);
		}
	}

}