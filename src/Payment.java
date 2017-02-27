import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);

		System.out.println("The initial tuition is :");
		Double T = imput.nextDouble();

		System.out.println("The percentage interest rate is : ");
		Double In = imput.nextDouble();

		Double totalTuition = 0.0;

		for (int n = 1; n < 5; n++) {
			totalTuition = T * ((Math.pow(1 + In / 100, n) - 1) / (In / 100));
		}
		System.out.println("The total tuition for is: $ " + totalTuition);

	}
}