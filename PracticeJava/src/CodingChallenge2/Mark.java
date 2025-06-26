package CodingChallenge2;
import java.util.Scanner;
public class Mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		if(mark>35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
