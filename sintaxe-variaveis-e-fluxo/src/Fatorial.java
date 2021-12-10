
public class Fatorial {
    public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			int calculoFatorial = 1;
			
			for(int j = i; j > 0; j--)
				calculoFatorial *= j;
			
			System.out.println("O fatorial de " + i + "! = " + calculoFatorial);
		}
	}
}
