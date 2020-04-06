package lambda;

public class MainCalculator {

	public static void main(String[] args) {
		
		/*ICalculator calculator = (n) -> System.out.println(n + ", Bienvenido a las expresiones lambda");
		calculator.mensaje("Bastian");*/
		
		ICalculator calculator = (n1, n2) -> {
			double result = n1 +n2;
			System.out.println("La suma de " + n1 + " + "+n2+" es "+ result);
		};
		
		calculator.operation(1, 3);
	}

}
