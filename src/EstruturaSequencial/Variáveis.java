package EstruturaSequencial;

public class Variáveis {

	/**
	 * Variaveis dp tipo primitivo e seus respectivos tamanhos
	 *
	 */

// Um bit pode armazenar 0 ou 1, ou seja, duas possibilidades. Num valor de tamanho 8 bits,
// eu posso guardar 2^8 = 256 possiblidades. -128 a 127.

//  <tipo> <nome> = <valor inicial>;
	int idade = 25; // 32 bits
	double altura = 1.68; // 64 bits
	// armazena o caracter unicode de cada caracter.
	char sexo = 'F'; // 16 bits
	byte num = 0; // 8 bits
	short pequeno = 100; // 16 bits
	long fatorial = 274527845234L; // 64 bits
	float y = -12.0f; // 32 bits
	boolean valido = true; // 1 bit

	// Não primitivo
	String texto = "Teste teste teste";
	
	/**
	 * Números inteiros: bye, short, int, long;
	 * Números com ponto flutuante: float, double;
	 * Valor verdade: boolean;
	 * Um caractere Unicode: char;
	 * 
	 * Sempre declarar variáveis no padrão camel case (salarioJoao);
	 */

}
