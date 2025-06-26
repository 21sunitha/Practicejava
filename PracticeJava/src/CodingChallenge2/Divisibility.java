package CodingChallenge2;
import java.util.Scanner;
public class Divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number%3==0&number%5==0) {
			System.out.println("divisible by 2 and 3");
		}
		else {
			System.out.println("not divisible");
		}

	}

}
