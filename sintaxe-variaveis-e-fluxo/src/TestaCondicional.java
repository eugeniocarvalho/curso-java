
public class TestaCondicional {
    public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 15;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
			System.out.println("Pode passar");
		} else if (quantidadePessoas > 2) {
			System.out.println("Você é de menor, mas está acompanhado, pode passar");
		}
		else {
			System.out.println("Não pode passar, é de menor e está sozinho");
		}
	}
}
