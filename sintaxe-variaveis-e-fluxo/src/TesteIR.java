
public class TesteIR {
	public static void main(String[] args) {
		double salario = 1900;
		double calculoImposto = 0;

		if (salario <= 2800)
			calculoImposto = salario * 0.925;
		else if (salario <= 3751)
			calculoImposto = salario * 0.85;
		else if (salario <= 4664)
			calculoImposto = salario * 0.775;

		System.out.println("Imposto é: " + calculoImposto);
	}
}
