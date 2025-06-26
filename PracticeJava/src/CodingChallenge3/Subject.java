package CodingChallenge3;
import java.util.Scanner;
public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int total=a+b+c+d+e;
		int avg=total/5;
		if(avg<35) {
			System.out.println("you need to improve");
		}
		else {
			System.out.println("you are good enough to go");
		}
	}

}
