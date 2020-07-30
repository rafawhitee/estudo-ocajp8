package operadores;

public class OperadoresMain {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {

		/********* O operador == compara a refer�ncia na mem�ria (Endere�o de mem�ria)  ********/
		/********* O m�todo equals compara o conte�do ********/
		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");

		System.out.println(str1 == str2); // Retornar� TRUE pois est�o no mesmo endere�o de mem�ria
		System.out.println(str1 == str3); // Str 3 foi alocada com new ent�o est� em outro lugar da mem�ria, retornar�
											// FALSE
		System.out.println(str1.equals(str3)); // Retornar� TRUE, pois ele ir� comparar o conte�do da string, no caso
												// s�o iguais

		/******** SWITCH N�O ACEITA BOOLEAN E TIPOS LONG PARA COMPARAR ********/
		Long teste = new Long(3L);

		// Se descomentar ir� mostrar erro, pois n�o � aceito Long no switch (nem Boolean) como j� dito
//		switch(teste) {
//		
//		}

		/******** &, |, && e || ********/
		// Quando tem apenas um (& ou |), os dois lados da opera��o ser�o executados
		// Quando tem os dois (&& ou ||), o lado direito da express�o s� ser� executado
		// se o lado esquerdo for true (caso do &&) ou false (no caso do ||)
		String strTeste = "Ol� mundo";
		String strTeste2 = null;

		// Como est� usando os dois (||)
		// se a primeira express�o for true (strTeste.equals("Ol� mundo"), ele n�o ir� executar a segunda express�o
		// logo n�o ir� gerar NullPointerException, pois strTeste � NULL
		if (strTeste.equals("Ol� mundo") || strTeste2.length() > 0) {
			System.out.println("Entrou no if usando o OR Duplo (||)");
		}
		
		System.out.println("");

		// Est� usando o |, logo ele ir� comparar as 2 express�es, mesmo a primeira j� retornando TRUE
		// Ent�o ele ir� gerar um NullPointerException
		if (strTeste.equals("Ol� mundo") | strTeste2.length() > 0) {
			System.out.println("Ol�aaaa");
		}

	}

}
