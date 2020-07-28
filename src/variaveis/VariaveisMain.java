package variaveis;

public class VariaveisMain {

	public static void main(String[] args) {
		
		/***** TABELA DE ARMAZENAMENTO DE MEM�RIA *****/ 
		/* boolean ocupa 1 byte na mem�ria, apesar de utilizar um �nico 1 bit... (0 para false e 1 para true) */
		/* byte exatamente 1 byte na mem�ria (8 bits), ent�o se voc� criar um array de 10 bytes e preencher todos, vai ocupar realmente 10 bytes (80 bits) */
		/* short ocupa 2 bytes (16 bits) M�nimo: -32.768 e M�ximo: +32.767 */
		/* int ocupa 4 bytes (32 bits) M�nimo: -2.147.483.648 e M�ximo: +2.147.483.647 */
		/* float ocupa 4 bytes (32 bits) M�nimo: -3.4028^38 e M�ximo: +-3.4028^38 */
		/* long ocupa 8 bytes (64 bits) M�nimo: -9.223.372.036.854.775.808 e M�ximo: +9.223.372.036.854.775.807 */
		/* double ocupa 8 bytes (64 bits) M�nimo: -1,7976^308 e M�ximo: +1,7976^308 */
		
		/***** VARI�VEIS NUM�RICAS *****/
		// Vari�veis inteiras que comecam com 0 s�o base Octal
		// Vari�veis inteiras que comecam com 0x s�o base Hexadecimal
		// Vari�veis num�ricas podem ter _ na sua declara��o
		
		int inteiroBaseOctal = 0133; // Octal
		int inteiroBaseHexadecimal = 0x32F; // HexaDecimal
		int inteiroComUnderline = 3____2; // Ir� anular todos os underline e ficar� 32.
		
		System.out.println("Octal: " + inteiroBaseOctal); // Imprime 91 (o Java passa para a base 10)
		System.out.println("Hexadecimal: " + inteiroBaseHexadecimal); // Imprime 815 (o Java passa para a base 10)
		System.out.println("Inteiro com Underline: " + inteiroComUnderline); // Imprime 32
		
		/***** CHAR, VETORES E BYTE *****/
		char qualquerLetra = 'a'; // Char tem que ser declarado com aspas simples, pois duplas s�o STRING
		char[] vetorDeChar = {'O', 'l', '�', ',', 'm', 'u', 'n', 'd', 'o'}; // Obs: n�o s�o aceitas espa�o em branco, ex: '' ou 'a '
		char[] vetorDeChar2 = new char[4]; // Criei dinamicamente um vetor com 30 espa�os (Index de 0 a 3)
		vetorDeChar2[0] = 'r';
		vetorDeChar2[1] = 'a';
		vetorDeChar2[2] = 'f';
		vetorDeChar2[3] = 'a';
		
		// Byte vai de -128 a 127 (byte s�o 8 bits)
		byte minimoDoValorByte = -128;
		byte maximoDoValorByte = 127;
		byte[] arrayDeBytes = {89, 65};
		
		System.out.println(qualquerLetra);
		System.out.println(vetorDeChar);
		System.out.println(vetorDeChar2);
		System.out.println("M�nimo do Valor em Bytes: " + minimoDoValorByte);
		System.out.println("M�ximo do Valor em Bytes: " + maximoDoValorByte);
		System.out.println("Criando uma String a partir de um array de bytes (bytes[]): " + new String(arrayDeBytes));
		
	}

}
