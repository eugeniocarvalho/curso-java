
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1780.20;
		int valor = (int) salario; //casting
		long numeroGrande = 123091282310981301l;
		short valorPequeno = 1321;
		byte bemPequeno = 127;
		float pontoFlutuanteComFloat = 1.23f;
		
		System.out.println("Meu salário em double: " + salario);
		System.out.println("Meu salário em int: " + valor);
		System.out.println("Super muito grande com long: " + numeroGrande);
		System.out.println("Número pequeno tipo short: " + valorPequeno);
		System.out.println("Número bem pequeno tipo byte: " + bemPequeno);
		System.out.println("Ponto flutuante com float " + pontoFlutuanteComFloat);
	}
}
