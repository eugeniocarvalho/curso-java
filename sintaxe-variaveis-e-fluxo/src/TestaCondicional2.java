
public class TestaCondicional2 {
    public static void main (String[] args) {
    	System.out.println("Testando condicionais 2");
    	
    	int idade = 25;
    	int quantidadePessoas = 3;
    	boolean estaAcompanhado = quantidadePessoas >= 2;
    	
    	System.out.println("Valor de acompanhado = " + estaAcompanhado);
    	
    	if (idade >= 18 && estaAcompanhado) {
    		System.out.println("Pode passar");
    	}
    	else {
    		System.out.println("Pode passar não");
    	}
    }
}
