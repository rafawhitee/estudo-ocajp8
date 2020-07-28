package variaveis;

public class VariaveisMain {

	public static void main(String[] args) {
		
		/***** TABELA DE ARMAZENAMENTO DE MEMÓRIA *****/ 
		/* boolean ocupa 1 byte na memória, apesar de utilizar um único 1 bit... (0 para false e 1 para true) */
		/* byte exatamente 1 byte na memória (8 bits), então se você criar um array de 10 bytes e preencher todos, vai ocupar realmente 10 bytes (80 bits) */
		/* short ocupa 2 bytes (16 bits) Mínimo: -32.768 e Máximo: +32.767 */
		/* int ocupa 4 bytes (32 bits) Mínimo: -2.147.483.648 e Máximo: +2.147.483.647 */
		/* float ocupa 4 bytes (32 bits) Mínimo: -3.4028^38 e Máximo: +-3.4028^38 */
		/* long ocupa 8 bytes (64 bits) Mínimo: -9.223.372.036.854.775.808 e Máximo: +9.223.372.036.854.775.807 */
		/* double ocupa 8 bytes (64 bits) Mínimo: -1,7976^308 e Máximo: +1,7976^308 */
		
		/***** VARIÁVEIS NUMÉRICAS *****/
		// Variáveis inteiras que comecam com 0 são base Octal
		// Variáveis inteiras que comecam com 0x são base Hexadecimal
		// Variáveis numéricas podem ter _ na sua declaração
		
		int inteiroBaseOctal = 0133; // Octal
		int inteiroBaseHexadecimal = 0x32F; // HexaDecimal
		int inteiroComUnderline = 3____2; // Irá anular todos os underline e ficará 32.
		
		System.out.println("Octal: " + inteiroBaseOctal); // Imprime 91 (o Java passa para a base 10)
		System.out.println("Hexadecimal: " + inteiroBaseHexadecimal); // Imprime 815 (o Java passa para a base 10)
		System.out.println("Inteiro com Underline: " + inteiroComUnderline); // Imprime 32
		
		/***** CHAR, VETORES E BYTE *****/
		char qualquerLetra = 'a'; // Char tem que ser declarado com aspas simples, pois duplas são STRING
		char[] vetorDeChar = {'O', 'l', 'á', ',', 'm', 'u', 'n', 'd', 'o'}; // Obs: não são aceitas espaço em branco, ex: '' ou 'a '
		char[] vetorDeChar2 = new char[4]; // Criei dinamicamente um vetor com 30 espaços (Index de 0 a 3)
		vetorDeChar2[0] = 'r';
		vetorDeChar2[1] = 'a';
		vetorDeChar2[2] = 'f';
		vetorDeChar2[3] = 'a';
		
		// Byte vai de -128 a 127 (byte são 8 bits)
		byte minimoDoValorByte = -128;
		byte maximoDoValorByte = 127;
		byte[] arrayDeBytes = {89, 65};
		
		System.out.println(qualquerLetra);
		System.out.println(vetorDeChar);
		System.out.println(vetorDeChar2);
		System.out.println("Mínimo do Valor em Bytes: " + minimoDoValorByte);
		System.out.println("Máximo do Valor em Bytes: " + maximoDoValorByte);
		System.out.println("Criando uma String a partir de um array de bytes (bytes[]): " + new String(arrayDeBytes));
		
	}

}
