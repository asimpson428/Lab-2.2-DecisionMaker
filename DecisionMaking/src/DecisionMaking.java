import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
	
	//Takes user input
	Scanner scnr = new Scanner(System.in);
	
	int answer;
	
	do
	{
	
		System.out.println("Please enter a number between 1 and 100:");
		answer = scnr.nextInt();
	
	

	}while (answer < 0 ||  answer > 101);
	
	//If number is odd
	if (answer%2 !=0) {
		System.out.println("The number is odd");
	}
	
	//If number is even and less than 25
	else if (answer % 2 ==0 && answer < 25) {
		System.out.println("The number is even and less than 25");
	}
	
	//if number us even and between 26 and 60
	
	else if ( answer % 2 ==0 && answer  > 25 || answer < 60) {
		System.out.println("Even");
	}
	
	//if number is even and greater than 60
	
	else if (answer%2 ==0 && answer > 60) {
		System.out.println("(answer) and even" );
	}
	
	//if number is odd and over 60
	else if (answer %2 !=0 || answer > 60) {
		System.out.println("(answer) and odd and over 60");
	}
	
	
	
	

}

}