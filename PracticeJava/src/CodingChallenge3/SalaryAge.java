package CodingChallenge3;
import java.util.Scanner;
public class SalaryAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		int age=sc.nextInt();
		int loan=sc.nextInt();
		if(salary>=20000||age<=25) {
			System.out.println("not eligible for loan");
		}
		else if(loan <=50000) {
			System.out.println("eligible for loan");
		}
		else if(loan>50000) {
			System.out.println("maximum loan amount");
		}

	}

}
