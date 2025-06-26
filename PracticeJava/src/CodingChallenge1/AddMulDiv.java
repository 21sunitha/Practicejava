package CodingChallenge1;
import java.util.Scanner;
public class AddMulDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=a*b*c;
		System.out.println(d);
		int e=a+b+c;
		System.out.println(e);
		int div=d/e;
		System.out.println(div);

	}

}
