package operadores;

public class QuestaoOperadoresUnitariosDuplos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = 0;
		boolean bool = false;
		
		// Vai ser executado pois o & executa mesmo o primeiro sendo false, então ( A = 1 ) nesse momento
		bool = false & maiorQueZero(a++);
		
		// Vai ser executado pois, ele executa o secundário no && se a primeira condição for true ( A = 0 ) 
		bool = true && maiorQueZero(a--);
		
		// Condições Unitárias (| e &) sempre executam os dois, então irá executar ( A = 1 )
		bool = true | maiorQueZero(a++);
		
		// Como é condição dupla (||) ele não precisa executar o segundo, se o primeiro já for true, então não faz nada
		bool = true || maiorQueZero(a++);
		
		// Imprime 1
		System.out.println(a);
	}
	
	public static boolean maiorQueZero(int a) {
		return a > 0 ? true : false;
	}

}