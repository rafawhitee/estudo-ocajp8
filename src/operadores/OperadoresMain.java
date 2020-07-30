package operadores;

public class OperadoresMain {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {

		/********* O operador == compara a referência na memória (Endereço de memória)  ********/
		/********* O método equals compara o conteúdo ********/
		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");

		System.out.println(str1 == str2); // Retornará TRUE pois estão no mesmo endereço de memória
		System.out.println(str1 == str3); // Str 3 foi alocada com new então está em outro lugar da memória, retornará
											// FALSE
		System.out.println(str1.equals(str3)); // Retornará TRUE, pois ele irá comparar o conteúdo da string, no caso
												// são iguais

		/******** SWITCH NÃO ACEITA BOOLEAN E TIPOS LONG PARA COMPARAR ********/
		Long teste = new Long(3L);

		// Se descomentar irá mostrar erro, pois não é aceito Long no switch (nem Boolean) como já dito
//		switch(teste) {
//		
//		}

		/******** &, |, && e || ********/
		// Quando tem apenas um (& ou |), os dois lados da operação serão executados
		// Quando tem os dois (&& ou ||), o lado direito da expressão só será executado
		// se o lado esquerdo for true (caso do &&) ou false (no caso do ||)
		String strTeste = "Olá mundo";
		String strTeste2 = null;

		// Como está usando os dois (||)
		// se a primeira expressão for true (strTeste.equals("Olá mundo"), ele não irá executar a segunda expressão
		// logo não irá gerar NullPointerException, pois strTeste é NULL
		if (strTeste.equals("Olá mundo") || strTeste2.length() > 0) {
			System.out.println("Entrou no if usando o OR Duplo (||)");
		}
		
		System.out.println("");

		// Está usando o |, logo ele irá comparar as 2 expressões, mesmo a primeira já retornando TRUE
		// Então ele irá gerar um NullPointerException
		if (strTeste.equals("Olá mundo") | strTeste2.length() > 0) {
			System.out.println("Oláaaaa");
		}

	}

}
