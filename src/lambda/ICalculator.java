package lambda;

@FunctionalInterface
public interface ICalculator {
	//Una interfaz funcional tiene un solo metodo
	//void mensaje(String a);
	void operation(double a, double b);
}
