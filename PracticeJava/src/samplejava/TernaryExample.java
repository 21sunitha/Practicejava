package samplejava;
import java.util.Scanner;
public class TernaryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		String result=num1>num2?"greater":"lesser";
		System.out.println(result);

	}

}
