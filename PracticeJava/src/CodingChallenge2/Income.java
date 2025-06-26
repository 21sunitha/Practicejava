package CodingChallenge2;
import java.util.Scanner;
public class Income {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int income=sc.nextInt();
		if(income>7000) {
			System.out.println("Scholarship is available");
		}
		else {
			System.out.println("not available");
		}

	}

}
