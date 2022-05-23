import java.util.Scanner; //utility to use scanner for user input console

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.println("Hello Java!");
		System.out.println("My name is Thuan");
		System.out.print("Java ask: \"What is your age: ");
		
		int age = scanner.nextInt();
		
		System.out.println("My age is: " + age);
		
	}

}
