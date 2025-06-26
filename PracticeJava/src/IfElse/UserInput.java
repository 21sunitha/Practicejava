package IfElse;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1==num2) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("not equal");
		}

	}

}
