public class Application {
	public static main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.addition(1,2)); // should be 3
		System.out.println(calculator.addition(1.5,3.2)); // should be 4.7
	}
}