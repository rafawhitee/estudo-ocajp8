package operadores;

public class QuestaoOperadoresUnitariosDuplos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = 0;
		boolean bool = false;
		
		// Vai ser executado pois o & executa mesmo o primeiro sendo false, ent�o ( A = 1 ) nesse momento
		bool = false & maiorQueZero(a++);
		
		// Vai ser executado pois, ele executa o secund�rio no && se a primeira condi��o for true ( A = 0 ) 
		bool = true && maiorQueZero(a--);
		
		// Condi��es Unit�rias (| e &) sempre executam os dois, ent�o ir� executar ( A = 1 )
		bool = true | maiorQueZero(a++);
		
		// Como � condi��o dupla (||) ele n�o precisa executar o segundo, se o primeiro j� for true, ent�o n�o faz nada
		bool = true || maiorQueZero(a++);
		
		// Imprime 1
		System.out.println(a);
	}
	
	public static boolean maiorQueZero(int a) {
		return a > 0 ? true : false;
	}

}